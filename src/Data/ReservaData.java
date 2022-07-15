
package Data;

import Modelos.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReservaData {
    
     private Connection con = null;      

    public ReservaData(Conexion conexion) {

        con = conexion.getConexion();            

    }
    
    public boolean agregarReserva(Reserva reserva) {
        boolean exito = true;
        String sql = "INSERT INTO reserva(idReserva, nombre, dni, fecha, hora, idMesa, activo) VALUES (?, ? ,? , ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getIdReserva());
            ps.setString(2, reserva.getNombre());
            ps.setInt(3, reserva.getDni());
            ps.setDate(4, Date.valueOf(reserva.getFecha()));
            ps.setInt(5,reserva.getHora());
            ps.setInt(6, reserva.getIdMesa());
            ps.setBoolean(7,reserva.isActivo());
            
             
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
            } else {

                exito = false;
            }

            ps.close();

        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error de sintaxis " + e);
        }

        return exito;
    }
    public boolean borrarReserva(int id) {

        boolean borrado = false;
        String sql = "UPDATE reserva SET activo = 0 WHERE idReserva = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {

                borrado = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis ");
        }

        return borrado;
    }
 
    public boolean modificarReserva(Reserva reserva) {
        boolean exito = false;

        String sql = "UPDATE reserva SET  nombre=?, dni=?, fecha=?, hora=?, idMesa=? WHERE idReserva = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps.setString(1, reserva.getNombre());
            ps.setInt(2, reserva.getDni());
            ps.setDate(3, Date.valueOf(reserva.getFecha()));
            ps.setInt(4,reserva.getHora());
            ps.setInt(5, reserva.getIdMesa());
            ps.setInt(6, reserva.getIdReserva());
            
            if (ps.executeUpdate() != 0) {

                exito = true;
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar la reserva");
        }

        return exito;

    }

    public ArrayList<Reserva> obtenerReservas() {
        ArrayList<Reserva> listaReservas = new ArrayList();       

        try {
            String sql = "SELECT * FROM reserva WHERE activo = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            
            Reserva reserva;
            while (resultSet.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setNombre(resultSet.getString("nombre"));
                reserva.setDni(resultSet.getInt("dni"));
                reserva.setFecha(resultSet.getDate("fecha").toLocalDate());
                reserva.setHora(resultSet.getInt("hora"));
                reserva.setIdMesa(resultSet.getInt("idMesa"));
                reserva.setActivo(resultSet.getBoolean("activo"));

                listaReservas.add(reserva);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede obtener las reservas");
        }
        return listaReservas;
    }
    
    public Reserva obtenerReservaxId(int id) {

        Reserva reserva = null;

        try {
            String sql = "SELECT * FROM reserva WHERE idReserva = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                 reserva = new Reserva();
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setNombre(resultSet.getString("nombre"));
                reserva.setDni(resultSet.getInt("dni"));
                reserva.setFecha(resultSet.getDate("fecha").toLocalDate());
                reserva.setHora(resultSet.getInt("hora"));
                reserva.setIdMesa(resultSet.getInt("idMesa"));
                reserva.setActivo(resultSet.getBoolean("activo"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reserva");
        }

        return reserva;
    }    
    
    
    
        public ArrayList<Reserva> buscarReservaXFecha(String fecha){
        ArrayList<Reserva> reservas = new ArrayList();
        
        String sql = "SELECT * FROM reserva WHERE fecha = ?";
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, fecha);
             
             ResultSet resultSet = ps.executeQuery();
             Reserva reserva;
             while (resultSet.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setNombre(resultSet.getString("nombre"));
                reserva.setDni(resultSet.getInt("dni"));
                reserva.setFecha(resultSet.getDate("fecha").toLocalDate());
                reserva.setHora(resultSet.getInt("hora"));
                reserva.setIdMesa(resultSet.getInt("idMesa"));
                reserva.setActivo(resultSet.getBoolean("activo"));
                reservas.add(reserva);
            }
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error de sentencia");
         }
         
         return reservas;
    }
    
         public ArrayList<Reserva> obtenerMesasReservadasenR(int idMesa) {
        ArrayList<Reserva> listaReservas = new ArrayList();       

        try {
            String sql = "SELECT * FROM reserva,mesa WHERE(reserva.idMesa = mesa.idMesa),  idMesa =?, AND reserva.activo=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
              Reserva reserva;
             while (resultSet.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setNombre(resultSet.getString("nombre"));
                reserva.setDni(resultSet.getInt("dni"));
                reserva.setFecha(resultSet.getDate("fecha").toLocalDate());
                reserva.setHora(resultSet.getInt("hora"));
                reserva.setIdMesa(resultSet.getInt("idMesa"));
                reserva.setActivo(resultSet.getBoolean("activo"));
                listaReservas.add(reserva);
            }
     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede obtener las reservas"
                    + "");
        }
        return listaReservas;
    }
        
}


package Data;

import Modelos.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            ps.setTime(5,reserva.getHora());
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
            if (e instanceof java.sql.SQLIntegrityConstraintViolationException) {
                exito=false;
                JOptionPane.showMessageDialog(null, "Ya existe una reserva registrada con ese número de dni");
            } else {

                JOptionPane.showMessageDialog(null, "Error de sintaxis " + e);

            }
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

        String sql = "UPDATE reserva SET idReserva =?, nombre=?, dni=?, fecha=?, hora=?, idMesa=?, activo=? WHERE idReserva = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, reserva.getIdReserva());
            ps.setString(2, reserva.getNombre());
            ps.setInt(3, reserva.getDni());
            ps.setDate(4, Date.valueOf(reserva.getFecha()));
            ps.setTime(5,reserva.getHora());
            ps.setInt(6, reserva.getIdMesa());
            ps.setBoolean(7,reserva.isActivo());
            
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
                reserva.setIdReserva(resultSet.getInt("isReserva"));
                reserva.setNombre(resultSet.getString("nombre"));
                reserva.setDni(resultSet.getInt("dni"));
                reserva.setFecha(resultSet.getDate("fecha").toLocalDate());
                reserva.setHora(resultSet.getTime("hora"));
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
            String sql = "SELECT * FROM mesa WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                 reserva = new Reserva();
                reserva.setIdReserva(resultSet.getInt("isReserva"));
                reserva.setNombre(resultSet.getString("nombre"));
                reserva.setDni(resultSet.getInt("dni"));
                reserva.setFecha(resultSet.getDate("fecha").toLocalDate());
                reserva.setHora(resultSet.getTime("hora"));
                reserva.setIdMesa(resultSet.getInt("idMesa"));
                reserva.setActivo(resultSet.getBoolean("activo"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener reserva");
        }

        return reserva;
    }    
   
}

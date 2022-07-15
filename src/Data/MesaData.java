
package Data;

import Modelos.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MesaData {
    
    private Connection con = null;      

    public MesaData(Conexion conexion) {

        con = conexion.getConexion();            

    }
    
    public boolean agregarMesa(Mesa mesa) {
        boolean exito = true;
       
        String sql = "INSERT INTO mesa(idMesa, capacidad,activo, estado) VALUES (? ,? , ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3,mesa.isActivo());
            ps.setString(4 ,mesa.getEstado());
             
            ps.executeUpdate();
           
            ResultSet rs = ps.getResultSet();
          /*  if (rs.next()) {
                mesa.getIdMesa();
            } else {
                //JOptionPane.showMessageDialog(null, "Error al intentar agregar la mesa");
                exito = false;
            }*/

            ps.close();

        } catch (SQLException e) {
            if (e instanceof java.sql.SQLIntegrityConstraintViolationException) {
                exito=false;
                JOptionPane.showMessageDialog(null, "Ya existe una mesa registrada con ese número");
            } else {

                JOptionPane.showMessageDialog(null, "Error de sintaxis " + e);

            }
        }

        return exito;
    }
    public boolean borrarMesa(int id) {

        boolean borrado = false;
        String sql = "UPDATE mesa SET activo = 0 WHERE idMesa = ?";
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
 
    public boolean modificarMesa(Mesa mesa) {
        

        String sql = "UPDATE  mesa SET capacidad = ?, activo = ?, estado = ? WHERE idMesa = ? ";
        boolean exito = false;
        try {
             PreparedStatement ps = con.prepareStatement(sql);            
         
            ps.setInt(1, mesa.getCapacidad());
            ps.setBoolean(2,mesa.isActivo());
            ps.setString(3 ,mesa.getEstado());
            ps.setInt(4, mesa.getIdMesa());
            if (ps.executeUpdate() != 0) {
                exito = true;
            }         

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis");
        }

        return exito;

    }

    public ArrayList<Mesa> obtenerMesasActivas() {
        ArrayList<Mesa> listaMesa = new ArrayList();       

        try {
            String sql = "SELECT * FROM mesa WHERE activo = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            
            Mesa mesa;
            while (resultSet.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(resultSet.getInt("idMesa"));
                mesa.setCapacidad(resultSet.getInt("capacidad"));
                mesa.setEstado(resultSet.getString("estado"));

                listaMesa.add(mesa);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede obtener las mesas");
        }
        return listaMesa;
    }
    
    public Mesa obtenerMesaxId(int id) {

        Mesa mesa = null;

        try {
            String sql = "SELECT * FROM mesa WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(resultSet.getInt("idMesa"));
                mesa.setCapacidad(resultSet.getInt("capacidad"));
                mesa.setActivo(resultSet.getBoolean("activo"));
                mesa.setEstado(resultSet.getString("estado"));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener alumnos");
        }

        return mesa;
    }    
    
     public ArrayList<Mesa> obtenerMesasReservadas() {
        ArrayList<Mesa> listaMesa = new ArrayList();       

        try {
            String sql = "SELECT * FROM mesa WHERE  (mesa.idMesa = reserva.idMesa) AND reserva.activo=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            
            Mesa mesa;
            while (resultSet.next()) {
                mesa =new Mesa();
                mesa.setIdMesa(resultSet.getInt("idMesa"));
                mesa.setCapacidad(resultSet.getInt("capacidad"));
                mesa.setEstado(resultSet.getString("estado"));

                listaMesa.add(mesa);
            }
     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede obtener las mesas");
        }
        return listaMesa;
    }
     public ArrayList<Mesa> obtenerMesasSinReservas() {
        ArrayList<Mesa> listaMesa = new ArrayList();       

        try {
            String sql = "SELECT mesa.idMesa, mesa.capacidad, mesa.estado FROM reserva,mesa WHERE mesa.idMesa not in ( reserva.idMesa) AND reserva.activo=1 AND mesa.activo=1;";
          //  String sql = "SELECT *FROM *mesa WHERE idMesa not in(select idMesa from reserva where idReserva = ?) AND reserva.activo=1 AND mesa.activo=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            
            Mesa mesa;
            while (resultSet.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(resultSet.getInt("idMesa"));
                mesa.setCapacidad(resultSet.getInt("capacidad"));
                mesa.setEstado(resultSet.getString("estado"));

                listaMesa.add(mesa);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede obtener las mesas");
        }
        return listaMesa;
    }
   
}

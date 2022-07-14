package Data;

import Modelos.Mesero;
import Modelos.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MeseroData {

    private Connection con;

    public MeseroData(Conexion conexion) {
        con = conexion.getConexion();
    }

    public boolean agregarMesero(Mesero mesero) {
        boolean exito = true;
        String sql = "INSERT INTO `mesero`(`nombre`, `apellido`, `dni`, telefono, activo) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getApellido());
            ps.setInt(3, mesero.getDni());
            ps.setLong(4, mesero.getTelefono());
            ps.setBoolean(5, mesero.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mesero.setIdMesero(rs.getInt("1"));
                JOptionPane.showMessageDialog(null, "Mesero agregado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar mesero");
                exito = false;
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "DNI YA EXISTENTE--- ERROR: " +  e);
        }catch(SQLException s){
            JOptionPane.showMessageDialog(null, "ERROR DE SENTENCIA");
        }
        return exito;
    }

    public Mesero buscarMesero(int idMesero) {
        Mesero mesero = new Mesero();
        String sql = "SELECT * FROM mesero WHERE idMesero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDni(rs.getInt("dni"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mesero;

    }

    public boolean borrarMesero(Mesero mesero) {
        boolean exito = true;
        String sql = "UPDATE `mesero` SET `activo`= 0 WHERE idMesero = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesero.getIdMesero());
            int rs = ps.executeUpdate();

            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Mesero dado de baja");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL DAR DE BAJA");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return exito;
    }
    
    public boolean modificarMesero(Mesero mesero){
        boolean exito = true;
        String sql = "UPDATE mesero SET  nombre = ?, apellido = ?, dni = ?, telefono = ?  WHERE dni = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getApellido());
            ps.setInt(3, mesero.getDni());
            ps.setLong(4, mesero.getTelefono());
            ps.setInt(5, mesero.getDni());
            int rs = ps.executeUpdate();
            if(rs == 0){
                exito = false;
            }
        }catch(SQLException ne){
            
        }
        return exito;
    }
    public boolean activarMesero(Mesero mesero){
        boolean exito = true;
        String sql = "UPDATE mesero SET activo = 1 WHERE dni = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesero.getDni());
            int rs = ps.executeUpdate();
            
            if(rs == 0){
                exito = false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return exito;
    }

//    public ArrayList<Mesero> obtenerMeseros() {
//        ArrayList<Mesero> listaMeseros = new ArrayList();
//        String sql = "SELECT * FROM mesero";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//
//            Mesero m;
//            while (rs.next()) {
//                m = new Mesero();
//
//                m.setIdMesero(rs.getInt("idMesero"));
//                m.setNombre(rs.getString("nombre"));
//                m.setApellido(rs.getString("apellido"));
//                m.setDni(rs.getInt("dni"));
//
//                listaMeseros.add(m);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return listaMeseros;
//    }
    
    public ArrayList<Mesero> obtenerMeserosActivos(){
        ArrayList<Mesero> listaMeseros = new ArrayList();
        String sql = "SELECT * FROM mesero WHERE activo = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            Mesero m;
            while (rs.next()) {
                m = new Mesero();

                m.setIdMesero(rs.getInt("idMesero"));
                m.setNombre(rs.getString("nombre"));
                m.setApellido(rs.getString("apellido"));
                m.setDni(rs.getInt("dni"));
                m.setTelefono(rs.getLong("telefono"));
                m.setActivo(rs.getBoolean("activo"));

                listaMeseros.add(m);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaMeseros;
    }
    
    public ArrayList<Mesero> obtenerMeserosInactivos(){
        ArrayList<Mesero> listaMeseros = new ArrayList();
        String sql = "SELECT * FROM mesero WHERE activo = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            Mesero m;
            while (rs.next()) {
                m = new Mesero();

                m.setIdMesero(rs.getInt("idMesero"));
                m.setNombre(rs.getString("nombre"));
                m.setApellido(rs.getString("apellido"));
                m.setDni(rs.getInt("dni"));
                m.setTelefono(rs.getLong("telefono"));
                m.setActivo(rs.getBoolean("activo"));

                listaMeseros.add(m);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaMeseros;
    }
    
    public Mesero obtenerMeseroxDNI(int DNI){
        Mesero mesero = new Mesero();
        String sql = "SELECT * FROM mesero WHERE dni = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, DNI);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDni(DNI);
                mesero.setTelefono(rs.getLong("telefono"));
                mesero.setActivo(rs.getBoolean("activo"));
            }else{
                return null;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return mesero;
    }

    public boolean tomarPedido(Mesero mesero, Pedido pedido) {
        boolean exito = true;
        String sql = "UPDATE `mesero` SET `idPedido`= ? WHERE idMesero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(2, mesero.getIdMesero());

            int rs = ps.executeUpdate();

            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Pedido tomado por el mesero:" + mesero.getApellido());
            } else {
                JOptionPane.showMessageDialog(null, "error");
                exito = false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exito;
    }

    public boolean cancelarPedido(Pedido pedido) {
        boolean exito = true;
        String sql = "UPDATE `pedido` SET `activo`= 0 WHERE idPedido = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getIdPedido());

            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Pedido cancelado");
            } else {
                JOptionPane.showMessageDialog(null, "error");
                exito = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return exito;
    }

    public boolean cobrarPedido(Pedido pedido) {
        boolean exito = true;
        String sql = "UPDATE pedido SET cobrado = 1 WHERE idPedido = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getIdPedido());

            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Pedido cobrado");
                String sql2 = "UPDATE detalle SET expirado = 1 WHERE idPedido = ?";
                try {
                    PreparedStatement p = con.prepareStatement(sql2);
                    p.setInt(1, pedido.getIdPedido());

                    int rx = p.executeUpdate();
                    if (rx == 1) {
                        String sql3 =  "UPDATE mesa SET estado = -1 WHERE idMesa = ?";
                        try {
                           PreparedStatement s = con.prepareStatement(sql3);
                           s.setInt(1, pedido.getMesa().getIdMesa());
                           
                           int r = s.executeUpdate();
                           if(r != 1){
                               exito = false;
                           }
                        } catch (Exception x) {
                            JOptionPane.showMessageDialog(null, x);
                        }
                    } else {
                        exito = false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error");
                exito = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return exito;
    }

}

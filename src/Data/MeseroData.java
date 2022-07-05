
package Data;

import Modelos.Mesero;
import Modelos.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class MeseroData {
    private Connection con;
    
    
    public MeseroData(Conexion conexion){
        con = conexion.getConexion();
    }
    
    
    public boolean agregarMesero(Mesero mesero){
        boolean exito = true;
        String sql = "INSERT INTO `mesero`(`nombre`, `apellido`, `dni`) VALUES (?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getApellido());
            ps.setLong(3, mesero.getDni());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                mesero.setIdMesero(rs.getInt("1"));
                JOptionPane.showMessageDialog(null, "Mesero agregado correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Error al agregar mesero");
                exito = false;
            }
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "ERROR DE SENTENCIA:" + sqle);
        }
        return exito;
    }
    
    public Mesero buscarMesero(int idMesero){
        Mesero mesero = new Mesero();
        String sql = "SELECT * FROM mesero WHERE idMesero = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setDni(rs.getInt("dni"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return mesero;
        
    }
    
    public boolean borrarMesero(Mesero mesero){
        boolean exito = true;
        String sql = "DELETE FROM `mesero` WHERE idMesero = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesero.getIdMesero());
            int rs = ps.executeUpdate();
            
            if(rs == 1){
                JOptionPane.showMessageDialog(null, "Mesero eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR MESERO");

            }
        }catch(Exception e){
               JOptionPane.showMessageDialog(null, e);

        }
        return exito;
    }
    
    public ArrayList<Mesero> obtenerMeseros(){
        ArrayList<Mesero> listaMeseros = new ArrayList();
        String sql = "SELECT * FROM mesero";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            Mesero m;
            while(rs.next()){
                m = new Mesero();
                
                m.setIdMesero(rs.getInt("idMesero"));
                m.setNombre(rs.getString("nombre"));
                m.setApellido(rs.getString("apellido"));
                m.setDni(rs.getInt("dni"));
                
                listaMeseros.add(m);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return listaMeseros;
    }
    public boolean tomarPedido(Mesero mesero, Pedido pedido){
        boolean exito = true;
        String sql = "UPDATE `mesero` SET `idPedido`= ? WHERE idMesero = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(2, mesero.getIdMesero());
            
            int rs = ps.executeUpdate();
            
            if(rs == 1){
                JOptionPane.showMessageDialog(null, "Pedido tomado por el mesero:" + mesero.getApellido());
            }else{
                JOptionPane.showMessageDialog(null, "error");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return exito;
    }
    
    
}

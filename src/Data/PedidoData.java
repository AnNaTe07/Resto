/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Samir
 */
import Modelos.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class PedidoData {

    private Connection con = null;
    

    public PedidoData(Conexion conex) {

        con = conex.getConexion();

    }

    // AGREGAR PEDIDO
    public boolean agregarPedido(Pedido ped) {
        boolean check = true;
        String sql = "INSERT INTO pedido( idMesa, idMesero, hora) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(2, ped.getMesa().getIdMesa());
            ps.setInt(3, ped.getMozo().getIdMesero());
            ps.setTime(7, ped.getHorario());
            ps.executeUpdate();
            ps.close();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ped.setIdPedido(rs.getInt(1));
            } else {
                check = false;
            }
            
        } catch (Exception e) {

        }
        return check;
    }

    // "CANCELAR" PEDIDO
    
    public boolean cancelarPedido (Pedido ped){
        
        boolean check = false;
        String sql = "UPDATE pedido SET activo = 0 WHERE idPedido = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ped.getIdPedido());
            if (ps.executeUpdate() != 0) {
                check = true;
            } 
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el pedido");
        }
        return check;
    }
   
}

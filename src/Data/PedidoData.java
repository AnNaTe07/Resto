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
    private int idPed;
    private double st;
    
    
    public PedidoData(Conexion conex) {

        idPed = 0 ;
        st = 0;
        con = conex.getConexion();

    }

// AGREGAR PEDIDO
    public boolean agregarPedido(Pedido ped) {
        boolean check = true;
        String sql = "INSERT INTO pedido(idPedido, idMesa, idMesero, idProductos, subtotal) VALUES ('?','?','?','?','?') ";
        try {       
            PreparedStatement ps = con.prepareStatement(sql);          
            for (Producto producto : ped.getListaProducto()) {            
                ps.setInt(1, ped.getIdPedido());
                ps.setInt(2, ped.getMesa().getIdMesa());
                ps.setInt(3, ped.getMozo().getIdMesero());
                ps.setInt(4, producto.getIdProducto());          
                ps.setDouble(5, producto.getPrecio());
                subTotal(producto.getPrecio());
//                ps.setDate(6, ped.getHorario());
                ps.executeUpdate();
            }
            aumento();
            ps.close();
            
        } catch (Exception e) {

            check = false;
            JOptionPane.showMessageDialog(null, "No se pudo cargar el pedido");
        }

        return check;

    }

// QUITA UN PEDIDO
    public boolean quitarPedido(Pedido ped) {
        boolean check = false;
        String sql = "DELET FROM pedido WHERE idPedido = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ped.getIdPedido());
            if (ps.executeUpdate() != 0) {

                check = true;
                JOptionPane.showMessageDialog(null, "Pedido eliminado correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el pedido.");
            }
            ps.close();
        } catch (Exception e) {
        }

        return check;
    }

// SIGUIENTE PEDIDO
    public void aumento() {

        idPed++;
    }
// SUBTOTAL
    public double subTotal(double cash){
        
        st += cash;        
        
        return cash;
    }
    
// TOTAL PEDIDO
    public double totalPedido(Pedido ped){
        double ttl = 0 ;
        String sql = "SELECT subtotal FROM pedido WHERE idPedido = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ped.getIdPedido());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ttl += rs.getDouble(5);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo obtener el total del pedido." );
        }
        
        return ttl;  
    }
}

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
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PedidoData {

    private Connection con = null;
    MeseroData mozo;
    MesaData mesa;

    public PedidoData(Conexion conex) {

        con = conex.getConexion();
        mozo = new MeseroData(conex);
        mesa = new MesaData(conex);
    }

    // AGREGAR PEDIDO
    public boolean agregarPedido(Pedido ped) {
        boolean check = true;
        String sql = "INSERT INTO pedido( idMesa, idMesero, hora) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ped.getMesa().getIdMesa());
            ps.setInt(2, ped.getMozo().getIdMesero());
            ps.setTime(3, ped.getHorario());
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
   
    
   //MOSTRAR TODOS LOS PEDIDOS
    
    public ArrayList<Pedido> mostrarPedidos(){
        ArrayList<Pedido> allPed = new ArrayList();
        String sql = "SELECT * FROM pedido  WHERE activo= 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa ms = new Mesa();
                Mesero mese = new Mesero();
                ms = mesa.obtenerMesaxId(rs.getInt("idMesa"));
                mese = mozo.buscarMesero(rs.getInt("idMesero"));               
                pedido.setIdPedido(rs.getInt(1));
                pedido.setMesa(ms);
                pedido.setMozo(mese);
                
                allPed.add(pedido);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR, no se pudieron mostrar los pedidos");
            
        }
       
        return allPed;
        
        
    }
}

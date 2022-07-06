/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Modelos.DetallePedido;
import Modelos.Pedido;
import Modelos.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Samir
 */
public class DetalleData {

    Connection con = null;

    public DetalleData(Conexion conex) {

        con = conex.getConexion();
        ArrayList<Producto> prodct = new ArrayList();
        prodct.addAll(agre());
    }
//String sql = "INSERT INTO `detalle`(idPedido, idProducto, cantidad) VALUES = (?, ?, ?)"
    
    public void agregarPedido(DetallePedido dped, Pedido ped, Producto product) {
        
        String sql = "INSERT INTO detalle (idPedido, idProducto, cantidad) VALUES = (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(2, ped.getIdPedido());
            dped.setPed(ped);
            ps.setInt(3, product.getIdProducto());
            dped.setProd(product);
            ps.setInt(4, dped.getCant());
            ps.executeUpdate();
            ps.close();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dped.setIdDetalle(rs.getInt(1));
                
            } 
        } catch (Exception e) {
            
        }

    }
    
    //CARGAR PRODUCTOS
    
    public ArrayList<Producto> agre(){
        ArrayList<Producto> xx = new ArrayList();
        
        return xx;
    }
//    //AGREGA LOS PRODUCTOS
//    
//    public boolean agregarProducto(DetallePedido ext){
//         boolean check = true;
//
//        String sql = "INSERT INTO `detalle`(idPedido) VALUES = (?)";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(2, ped.getIdPedido());
//            dped.setPed(ped);
//            ps.executeUpdate();
//            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                dped.setIdDetalle(rs.getInt(1));
//                agregarProducto(Producto prod);
//            } 
//        } catch (Exception e) {
//            
//        }
//
//        return check;
//    }
}

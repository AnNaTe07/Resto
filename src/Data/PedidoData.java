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
import java.util.*;


public class PedidoData {
    
    
    private Connection con = null;
    
    public PedidoData (Conexion conex){
        
        con = conex.getConexion();
        
    }
    
    
    public void agregarProducto(Producto prod){
        
        String sql = "INSERT INTO pedido(idPedido, idMesa, idMesero, idProductos, subtotal) VALUES ('?','?','?','?','?') ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(4, prod.getIdProducto());
            ps.setDouble(5, prod.isPrecio());
        } catch (Exception e) {
        }
    
    
    
    }
    
}

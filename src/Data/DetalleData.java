/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Modelos.DetallePedido;
import Modelos.Mesa;
import Modelos.Mesero;
import Modelos.Pedido;
import Modelos.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samir
 */
public class DetalleData {

    Connection con = null;
    MeseroData mozo;
    MesaData mesa;
    PedidoData ppd;
    ProductoData prodData;

    public DetalleData(Conexion conex) {
        con = conex.getConexion();
        mozo = new MeseroData(conex);
        mesa = new MesaData(conex);
        ppd = new PedidoData(conex);
        prodData = new ProductoData(conex);

    }

    //  AGREGAR PRODUCTOS AL PEDIDO
    public boolean agregarPedido(DetallePedido dped, Pedido ped, Producto product) {
        boolean check = true;
        String sql = "INSERT INTO detalle (idPedido, idProducto, cantidad) VALUES = (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ped.getIdPedido());
            dped.setPed(ped);
            ps.setInt(2, product.getIdProducto());
            dped.setProd(product);
            ps.setInt(3, dped.getCant());
            ps.executeUpdate();
            ps.close();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dped.setIdDetalle(rs.getInt(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR, no se pudieron agregar los productos");
            check = false;
        }
        return check;
    }

    //  BUSCAR PEDIDOS POR MESA
    public ArrayList<DetallePedido> detallePedidoPorMesa(Mesa mesa) {

        ArrayList<DetallePedido> allDet = new ArrayList();

        String sql = "SELECT * FROM detalle WHERE idMesa = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getIdMesa());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetallePedido dped = new DetallePedido();
                dped.setIdDetalle(rs.getInt("idDetalle"));
                Pedido ped = new Pedido();
                ped = ppd.obtenerPedidoXId(rs.getInt("idPedido"));
                dped.setPed(ped);
                Producto product = new Producto();
                product = prodData.obtenerProductoXId(rs.getInt("idProducto"));
                dped.setProd(product);
                dped.setCant(rs.getInt("cantidad"));
                dped.setExpirado(rs.getBoolean("expirado"));
                allDet.add(dped);
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la lista de pedidos");

        }

        return allDet;
    }

    
    //  BUSCAR / MOSTRAR DETALLE POR ID
    public DetallePedido detallePedidoPorId(int id) {

        DetallePedido dped = new DetallePedido();

        String sql = "SELECT * FROM detalle WHERE idDetalle = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dped.setIdDetalle(rs.getInt("idDetalle"));
                Pedido ped = new Pedido();
                ped = ppd.obtenerPedidoXId(rs.getInt("idPedido"));
                dped.setPed(ped);
                Producto product = new Producto();
                product = prodData.obtenerProductoXId(rs.getInt("idProducto"));
                dped.setProd(product);
                dped.setCant(rs.getInt("cantidad"));
                dped.setExpirado(rs.getBoolean("expirado"));

            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontro el pedido con el ID ingresado.");

        }

        return dped;
    }
    

    //  MOSTRAR DETALLES POR MOZO
    public ArrayList<DetallePedido> detallePedidoPorMozo(Mesero mozo) {

        ArrayList<DetallePedido> allDet = new ArrayList();

        String sql = "SELECT * FROM detalle WHERE idMesero = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mozo.getIdMesero());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetallePedido dped = new DetallePedido();
                dped.setIdDetalle(rs.getInt("idDetalle"));
                Pedido ped = new Pedido();
                ped = ppd.obtenerPedidoXId(rs.getInt("idPedido"));
                dped.setPed(ped);
                Producto product = new Producto();
                product = prodData.obtenerProductoXId(rs.getInt("idProducto"));
                dped.setProd(product);
                dped.setCant(rs.getInt("cantidad"));
                dped.setExpirado(rs.getBoolean("expirado"));

                allDet.add(dped);
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la lista de pedidos");

        }

        return allDet;
    }
    
    
    // TOTAL DE PEDIDO $$ 
    public double totalDePedido(Pedido pedido) {
        double total = 0;
        Producto producto ;
        String sql ="SELECT idProducto, cantidad FROM detalle WHERE idPedido = ? AND expirado = 0 ";
        

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getIdPedido());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                producto = prodData.obtenerProductoXId(rs.getInt("idProdcuto"));
                total += (producto.getPrecio() * rs.getInt("cantidad"));
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la informacion.");
        }
        return total;
    }

    
     //  MOSTRAR TODOS LOS DETALLES DE PEDIDOS ACTIVOS
    public ArrayList<DetallePedido> todoDetalleDePedido() {

        ArrayList<DetallePedido> allDet = new ArrayList();

        String sql = "SELECT * FROM detalle WHERE expirado = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                DetallePedido dped = new DetallePedido();
                dped.setIdDetalle(rs.getInt("idDetalle"));
                Pedido ped = new Pedido();
                ped = ppd.obtenerPedidoXId(rs.getInt("idPedido"));
                dped.setPed(ped);
                Producto product = new Producto();
                product = prodData.obtenerProductoXId(rs.getInt("idProducto"));
                dped.setProd(product);
                dped.setCant(rs.getInt("cantidad"));
                dped.setExpirado(rs.getBoolean("expirado"));
                allDet.add(dped);
            }
            rs.close();
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la informacion.");
            

        }
        return allDet;
    }
    
    
    //  MOSTRAR TODOS LOS DETALLES DE PEDIDOS EXPIRADOS
    public ArrayList<DetallePedido> todoDetalleDePedidoExpirado() {

        ArrayList<DetallePedido> allDet = new ArrayList();

        String sql = "SELECT * FROM detalle WHERE expirado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                DetallePedido dped = new DetallePedido();
                dped.setIdDetalle(rs.getInt("idDetalle"));
                Pedido ped = new Pedido();
                ped = ppd.obtenerPedidoXId(rs.getInt("idPedido"));
                dped.setPed(ped);
                Producto product = new Producto();
                product = prodData.obtenerProductoXId(rs.getInt("idProducto"));
                dped.setProd(product);
                dped.setCant(rs.getInt("cantidad"));
                dped.setExpirado(rs.getBoolean("expirado"));
                allDet.add(dped);
            }
            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener la informacion.");

        }
        return allDet;
    }
}



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
    public boolean agregarPedido(DetallePedido dped) {
        boolean check = true;
        String sql = "INSERT INTO `detalle` (`idPedido`, `idProducto`, `cantidad`, `expirado`) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dped.getPed().getIdPedido());
            ps.setInt(2, dped.getProd().getIdProducto());
            ps.setInt(3, dped.getCant());
            ps.setBoolean(4, dped.isExpirado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dped.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Productos cargados con exito." + e);
            }else{
                check = false;
                
            }            
            ps.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR, no se pudieron agregar los productos Xx" + e);
            
        }
        return check;
    }

    //  BUSCAR PEDIDOS POR MESA
    public ArrayList<DetallePedido> detallePedidoPorMesa(Mesa mesa) {

        ArrayList<DetallePedido> allDet = new ArrayList();

        String sql = "SELECT * FROM `detalle` WHERE detalle.idPedido IN (SELECT idPedido FROM `pedido` WHERE idMesa = ?)";

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
            JOptionPane.showMessageDialog(null, "No se pudo obtener la lista de pedidos" + e);

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
                Producto product = null;
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

        String sql = "SELECT * FROM `detalle` WHERE detalle.idPedido IN (SELECT idPedido FROM `pedido` WHERE idMesero = ?)";

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
            JOptionPane.showMessageDialog(null, "No se pudo obtener la lista de pedidos" + e);

        }

        return allDet;
    }

    // TOTAL DE PEDIDO $$ 
    public double totalDePedido(Pedido pedido) {
        double total = 0;
        Producto producto;
        String sql = "SELECT idProducto, cantidad FROM detalle WHERE idPedido = ? AND expirado = 0 ";

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

    //  MOSTRAR TODOS LOS DETALLES DE PEDIDOS SOLO ACTIVOS
    public ArrayList<DetallePedido> todoDetalleDePedidoSelect() {

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
    
    //MUESTRA TODOS LOS DETALLES
    public ArrayList<DetallePedido> todoDetalleDePedido() {

        ArrayList<DetallePedido> allDet = new ArrayList();

        String sql = "SELECT * FROM detalle ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                DetallePedido dped = new DetallePedido();
                dped.setIdDetalle(rs.getInt("idDetalle"));
                Pedido ped = null;
                ped = ppd.obtenerPedidoXId(rs.getInt("idPedido"));
                dped.setPed(ped);
                Producto product = null;
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

    //  BUSCAR PEDIDOS POR MESA Y MOZO
    public ArrayList<DetallePedido> detallePedidoPorMesaMozo(Mesa mesa, Mesero moso) {

        ArrayList<DetallePedido> allDet = new ArrayList();

        String sql = "SELECT * FROM detalle WHERE idMesa = ? AND idMozo = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, moso.getIdMesero());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetallePedido dped = new DetallePedido();
                dped.setIdDetalle(rs.getInt("idDetalle"));
                Pedido ped = null;
                ped = ppd.obtenerPedidoXId(rs.getInt("idPedido"));
                dped.setPed(ped);
                Producto product = null;
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

}

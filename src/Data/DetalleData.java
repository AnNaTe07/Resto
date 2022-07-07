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
//String sql = "INSERT INTO `detalle`(idPedido, idProducto, cantidad) VALUES = (?, ?, ?)"

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
    public ArrayList<DetallePedido> pedidoPorMesa(Mesa mesa) {

        ArrayList<DetallePedido> allDet = new ArrayList();

        String sql = "SELECT * FROM detalle WHERE idMesa = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getIdMesa());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                DetallePedido dped = new DetallePedido();
                dped.setIdDetalle(rs.getInt("idDetalle"));

                Pedido ped;
                ped = ppd.obtenerPedidoXId(rs.getInt("idPedido"));
                dped.setPed(ped);
                Producto product = new Producto();
                product = prodData.obtenerProductoXId(0);
                dped.setProd(product);

            }
        } catch (Exception e) {
        }

        return allDet;
    }


}

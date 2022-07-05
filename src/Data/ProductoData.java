package Data;

import Modelos.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection con = null;

    public ProductoData(Conexion conex) {

        con = conex.getConexion();

    }

    public boolean agregarProducto(Producto producto) {
        boolean exito = true;
        String sql = "INSERT INTO producto(nombre, cantidad, precio) VALUES (? ,? , ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
            } else {

                exito = false;
            }

            ps.close();

        } catch (SQLException e) {
            if (e instanceof java.sql.SQLIntegrityConstraintViolationException) {
                exito=false;
                JOptionPane.showMessageDialog(null, "Ya existe un alumno registrado con ese número de dni");
            } else {

                JOptionPane.showMessageDialog(null, "Error de sintaxis " + e);

            }
        }

        return exito;
    }

    public boolean borrarProducto(int id) {
        boolean exito = false;

        String sql = "DELETE FROM producto WHERE idProducto = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {

                exito = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el producto");
        }

        return exito;
    }

    public boolean modificarProducto(Producto producto) {
        boolean exito = false;

        String sql = "UPDATE  producto SET nombre = ?, cantidad = ?, precio = ? WHERE idProducto = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getIdProducto());

            if (ps.executeUpdate() != 0) {

                exito = true;
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el producto");
        }

        return exito;

    }

    public ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> productos = new ArrayList();

        String sql = "SELECT * FROM producto";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            Producto producto;
            while (resultSet.next()) {
                producto = new Producto();
                producto.setIdProducto(resultSet.getInt("idProducto"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setPrecio(resultSet.getDouble("precio"));
                producto.setCantidad(resultSet.getInt("cantidad"));

                productos.add(producto);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener los productos");
        }
        return productos;
    }

    public Producto obtenerProductosXnombre(String nombre) {
        Producto producto = null;

        String sql = "SELECT * FROM producto WHERE nombre = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nombre);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                producto = new Producto();
                producto.setIdProducto(resultSet.getInt("idProducto"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setPrecio(resultSet.getDouble("precio"));
                producto.setCantidad(resultSet.getInt("cantidad"));

               
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener los productos");
        }
        return producto;
    }

}

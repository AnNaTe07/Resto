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
        String sql = "INSERT INTO producto(nombre, cantidad, precio, activo, categoria) VALUES (? , ? , ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.isActivo());
            ps.setInt(5, producto.getCategaoria());

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
                exito = false;
                JOptionPane.showMessageDialog(null, "Ya existe un alumno registrado con ese número de dni");
            } else {

                JOptionPane.showMessageDialog(null, "Error de sintaxis " + e);

            }
        }

        return exito;
    }

    public boolean borrarProducto(int id) {
        boolean exito = false;
        String sql = "UPDATE producto SET activo = 0 WHERE idProducto = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            if (ps.executeUpdate() != 0) {

                exito = true;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis");
        }
        return exito;
    }

    public boolean modificarProducto(Producto producto) {
        boolean exito = false;

        String sql = "UPDATE  producto SET nombre = ?, cantidad = ?, precio = ?, activo = ?,categoria = ? WHERE idProducto = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.isActivo());
            ps.setInt(5, producto.getCategaoria());
            ps.setInt(6, producto.getIdProducto());

            if (ps.executeUpdate() != 0) {

                exito = true;
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de sintaxis");
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
                producto.setActivo(resultSet.getBoolean("activo"));
                producto.setCategaoria(resultSet.getInt("categoria"));

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

        String sql = "SELECT * FROM producto WHERE nombre LIKE ?";

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
                producto.setActivo(resultSet.getBoolean("activo"));
                producto.setCategaoria(resultSet.getInt("categoria"));

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener los productos");
        }
        return producto;
    }

    public Producto obtenerProductoXId(int id) {
        Producto producto = null;

        String sql = "SELECT * FROM producto WHERE idProducto = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {

                producto = new Producto();
                producto.setIdProducto(resultSet.getInt("idProducto"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setPrecio(resultSet.getDouble("precio"));
                producto.setCantidad(resultSet.getInt("cantidad"));
                producto.setActivo(resultSet.getBoolean("activo"));
                producto.setCategaoria(resultSet.getInt("categoria"));
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener el producto");
        }
        return producto;
    }

}

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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    public boolean cargarPedido(Pedido ped) {
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

            JOptionPane.showMessageDialog(null, "ERROR, no se pudo cargar el pedido.");
        }

        return check;
    }

    //MOSTRAR TODOS LOS PEDIDOS ACTIVOS
    public ArrayList<Pedido> mostrarPedidos() {
        ArrayList<Pedido> allPed = new ArrayList();
        String sql = "SELECT * FROM pedido  WHERE activo= 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa ms = null;
                Mesero mese = null;
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

    //MOSTRAR TODOS LOS PEDIDOS INACTIVOS
    public ArrayList<Pedido> mostrarPedidosInactivos() {
        ArrayList<Pedido> allPed = new ArrayList();
        String sql = "SELECT * FROM pedido  WHERE activo= 0";

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
            JOptionPane.showMessageDialog(null, "ERROR, no se pudieron mostrar los pedidos.");

        }
        return allPed;

    }
    
    // OBTENER PEDIDO POR ID
    public Pedido obtenerPedidoXId(int idPedido) {
        String sql = "SELECT * FROM pedido WHERE idPedido = ?";
        Pedido pedido = new Pedido();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pedido.setIdPedido(idPedido);
                Mesa ms = new Mesa();
                Mesero mesero = new Mesero();
                ms = mesa.obtenerMesaxId(rs.getInt("idMesa"));
                mesero = mozo.buscarMesero(rs.getInt("idMesero"));
                pedido.setMesa(ms);
                pedido.setMozo(mesero);
                pedido.setActivo(rs.getBoolean("activo"));
                pedido.setCobrado(rs.getBoolean("cobrado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHorario(rs.getTime("hora"));
                ps.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR, no se pudo mostrar el pedido.");

        }

        return pedido;
    }

    //LISTAR PEDIDO X MESA EN UNA FECHA ENTRE HORAS
    public ArrayList<Pedido> listaPedidosxMesa(int idMesa, LocalDate fecha) {
        ArrayList<Pedido> lista = new ArrayList();

        try {
            String sql = "SELECT * FROM pedido WHERE idMesa = ? AND fecha =?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            Pedido pedido;

            while (rs.next()) {
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));

                Mesa me = mesa.obtenerMesaxId(rs.getInt("idMesa"));
                pedido.setMesa(me);

                Mesero mesero = mozo.buscarMesero(rs.getInt("idMesero"));
                pedido.setMozo(mesero);

                pedido.setActivo(rs.getBoolean("activo"));
                pedido.setCobrado(rs.getBoolean("cobrado"));
                pedido.setSubTotal(rs.getDouble("subTotal"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHorario(rs.getTime("horario"));

                lista.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pueden obtener las mesas");
        }
        return lista;
    }

    // OBTENER PEDIDOS POR MOZO
    public ArrayList<Pedido> obtenerPedidoXMozo(Mesero mozo) {
        String sql = "SELECT * FROM pedido WHERE idMesero = ?";
        ArrayList<Pedido> pddo = new ArrayList();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mozo.getIdMesero());
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa ms = new Mesa();
                ms = mesa.obtenerMesaxId(rs.getInt("idMesa"));
                pedido.setMesa(ms);
                pedido.setMozo(mozo);
                pedido.setActivo(rs.getBoolean("activo"));
                pedido.setCobrado(rs.getBoolean("cobrado"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHorario(rs.getTime("hora"));
                ps.close();
                pddo.add(pedido);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR, no se pudo mostrar el pedido.");

        }

        return pddo;
    }
}

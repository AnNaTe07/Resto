
package Modelos;

import java.util.Date;
import java.sql.*;
import java.time.LocalDate;


public class Pedido {
    
    private int idPedido;
    private Mesa mesa;
    private Mesero mozo;
    private boolean activo;
    private boolean cobrado;
    private double subTotal;
    private LocalDate fecha;
    private Time horario;

    public Pedido() {
    }

    public Pedido(Mesa mesa, Mesero mozo, boolean cobrado, double subTotal, LocalDate fecha, Time horario) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.cobrado = cobrado;
        this.subTotal = subTotal;
        this.fecha = fecha;
        this.horario = horario;
    }

    public Pedido(int idPedido, Mesa mesa, Mesero mozo, boolean cobrado, double subTotal, LocalDate fecha, Time horario) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mozo = mozo;
        this.cobrado = cobrado;
        this.subTotal = subTotal;
        this.fecha = fecha;
        this.horario = horario;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMozo() {
        return mozo;
    }

    public void setMozo(Mesero mozo) {
        this.mozo = mozo;
    }

    public boolean isCobrado() {
        return cobrado;
    }

    public void setCobrado(boolean cobrado) {
        this.cobrado = cobrado;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
 
    
    
    
}

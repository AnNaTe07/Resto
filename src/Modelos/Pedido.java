/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Date;
import java.sql.*;
import java.time.*;

/**
 *
 * @author Samir
 */
public class Pedido {
    
    private int idPedido;
    private Mesa mesa;
    private Mesero mozo;
    private boolean activo;
    private boolean cobrado;
    private double subTotal;
    private Date fecha;
    private Time horario;

    public Pedido() {
    }

    public Pedido(Mesa mesa, Mesero mozo, boolean cobrado, double subTotal, Date fecha, Time horario, boolean activo) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.cobrado = cobrado;
        this.subTotal = subTotal;
        this.fecha = fecha;
        this.horario = horario;
        this.activo = activo;
    }

    public Pedido(int idPedido, Mesa mesa, Mesero mozo, boolean cobrado, double subTotal, Date fecha, Time horario, boolean activo) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mozo = mozo;
        this.cobrado = cobrado;
        this.subTotal = subTotal;
        this.fecha = fecha;
        this.horario = horario;
        this.activo = activo;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    
 
    
    
    
}

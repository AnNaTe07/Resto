/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

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
    private LocalDate fecha;
    private LocalTime horario;//cambiar esto

    public Pedido() {
    }

     public Pedido(Mesa mesa, Mesero mozo,  LocalTime horario) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.horario = horario;
      
    }
     public Pedido(Mesa mesa, Mesero mozo, double subTotal) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.subTotal = subTotal;
        
    }
    public Pedido(Mesa mesa, Mesero mozo, boolean cobrado, double subTotal, LocalDate fecha, LocalTime horario, boolean activo) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.cobrado = cobrado;
        this.subTotal = subTotal;
        this.fecha = fecha;
        this.horario = horario;
        this.activo = activo;
    }

    public Pedido(int idPedido, Mesa mesa, Mesero mozo, boolean cobrado, double subTotal, LocalDate fecha, LocalTime horario, boolean activo) {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "idPedido=" + idPedido + ", mesa=" + mesa + ", subTotal=" + subTotal + ", fecha=" + fecha + ", horario=" + horario + '}';
    }
    
    

    
 
    
    
    
}

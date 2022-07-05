/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.*;
import java.sql.*;
import java.time.*;

/**
 *
 * @author Samir
 */
public class Pedido {
    
    private int idPedido;
    private HashSet <Producto> listaProducto;
    private Mesa mesa;
    private Mesero mozo;
    private double subTotal;
    private Time horario;

    public Pedido() {
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

 
    public void setHorario(Time horario) {
       
    }

    public Time getHorario() {
       return Time.valueOf(LocalTime.now());
    }

  

    public Pedido(HashSet<Producto> listaProducto, Mesa mesa, double subTotal, Time horario, Mesero mozo) {
        this.listaProducto = listaProducto;
        this.mesa = mesa;
        this.subTotal = subTotal;
        this.horario = horario;
        this.mozo = mozo;
       
    }

    public Mesero getMozo() {
        return mozo;
    }

    public void setMozo(Mesero mozo) {
        this.mozo = mozo;
    }

   
    public Pedido(int idPedido , HashSet<Producto> listaProducto, Mesa mesa, double subTotal, Time horario, Mesero mozo) {
        this.idPedido = idPedido;
        this.listaProducto = listaProducto;
        this.mesa = mesa;
        this.subTotal = subTotal;
        this.horario = horario;
        this.mozo = mozo;
       
    }

    public int getIdPedido() {
        return idPedido;
    }


    public HashSet<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(Producto listaProducto) {
        this.listaProducto.add(listaProducto);
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "ID de pedido: "+ idPedido + "Subtotal: " +subTotal ;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.*;

/**
 *
 * @author Samir
 */
public class Pedido {
    
    private int idPedido;
    private HashSet <Producto> listaProducto;
    private Mesa mesa;
    private double subTotal;

    public Pedido() {
    }

    public Pedido(HashSet<Producto> listaProducto, Mesa mesa, double subTotal) {
        this.listaProducto = listaProducto;
        this.mesa = mesa;
        this.subTotal = subTotal;
    }

   
    public Pedido(int idPedido , HashSet<Producto> listaProducto, Mesa mesa, double subTotal) {
        this.idPedido = idPedido;
        this.listaProducto = listaProducto;
        this.mesa = mesa;
        this.subTotal = subTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }


    public HashSet<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(HashSet<Producto> listaProducto) {
        this.listaProducto = listaProducto;
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

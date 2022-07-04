/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.List;

/**
 *
 * @author duvar
 */
public class Mesero {
    private int idMesero;
    private String nombre;
    private String apellido;
    private Long dni;
    private List<Pedido> listaPedidos;

    
    //Constructores
    public Mesero() {
    }

    public Mesero(String nombre, String apellido, Long dni, List<Pedido> listaPedidos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.listaPedidos = listaPedidos;
    }

    public Mesero(int idMesero, String nombre, String apellido, Long dni, List<Pedido> listaPedidos) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.listaPedidos = listaPedidos;
    }
    
    //Getters y Setters

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
    
    
    
}


package Modelos;

import java.util.List;

public class Mesero {
    private int idMesero;
    private String nombre;
    private String apellido;
    private int dni;
    //private List<Pedido> listaPedidos;

    
    //Constructores
    public Mesero() {
    }

    public Mesero(String nombre, String apellido, int dni/*, List<Pedido> listaPedidos*/) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        //this.listaPedidos = listaPedidos;
    }

    public Mesero(int idMesero, String nombre, String apellido, int dni/*, List<Pedido> listaPedidos*/) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        //this.listaPedidos = listaPedidos;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

//    public List<Pedido> getListaPedidos() {
//        return listaPedidos;
//    }
//
//    public void setListaPedidos(List<Pedido> listaPedidos) {
//        this.listaPedidos = listaPedidos;
//    }

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Samir
 */
public class DetallePedido {
    
    private int idDetalle;
    private Pedido ped;
    private Producto prod;
    int cant;

    public DetallePedido() {
    }

    public DetallePedido(Pedido ped, Producto prod, int cant) {
        this.ped = ped;
        this.prod = prod;
        this.cant = cant;
    }

    public DetallePedido(int idDetalle, Pedido ped, Producto prod, int cant) {
        this.idDetalle = idDetalle;
        this.ped = ped;
        this.prod = prod;
        this.cant = cant;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Pedido getPed() {
        return ped;
    }

    public void setPed(Pedido ped) {
        this.ped = ped;
    }

    public Producto getProd() {
        return prod;
    }

    public void setProd(Producto prod) {
        this.prod = prod;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "idDetalle=" + idDetalle + ", ped=" + ped + ", prod=" + prod + ", cant=" + cant + '}';
    }
    
}

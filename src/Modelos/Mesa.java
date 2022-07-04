
package Modelos;

import java.time.LocalDate;
import java.util.HashSet;

public class Mesa {
    
    private int idMesa; 
    private Reserva reserva;
    private int capacidad;
    private boolean ocupada;
    private LocalDate fecha;
    private HashSet <Producto> listaProducto;

    public Mesa() {
    }

    public Mesa(Reserva reserva, int capacidad, boolean ocupada, LocalDate fecha, HashSet<Producto> listaProducto) {
        this.idMesa = idMesa;
        this.reserva = reserva;
        this.capacidad = capacidad;
        this.ocupada = ocupada;
        this.fecha = fecha;
        this.listaProducto = listaProducto;
    }

    public Mesa(int idMesa, Reserva reserva, int capacidad, boolean ocupada, LocalDate fecha, HashSet<Producto> listaProducto) {
        this.idMesa = idMesa;
        this.reserva = reserva;
        this.capacidad = capacidad;
        this.ocupada = ocupada;
        this.fecha = fecha;
        this.listaProducto = listaProducto;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public HashSet<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setListaProducto(HashSet<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
}

    
    
    


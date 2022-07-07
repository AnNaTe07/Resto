
package Modelos;

import java.time.LocalDate;

public class Mesa {
    
    private int idMesa; 
    private int capacidad;
    private boolean ocupada;
    private LocalDate fecha;
    private boolean activo;
    private int estado;

    public Mesa() {
    }

    public Mesa( int capacidad, boolean ocupada, LocalDate fecha, boolean activo, int estado) {
   
        this.capacidad = 6;
        this.ocupada = ocupada;
        this.fecha = fecha;
        this.activo = activo;
        this.estado = 0;
    }

    public Mesa(int idMesa, int capacidad, boolean ocupada, LocalDate fecha, boolean activo, int estado) {
        this.idMesa = idMesa;
        this.capacidad = 6;
        this.ocupada = ocupada;
        this.fecha = fecha;
        this.activo = activo;
        this.estado = 0;
    }

    public int getIdMesa() {
        return idMesa;
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

    public boolean isActivo() {
        return activo;
    }

    public int getEstado() {
        return estado;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
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

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa n°" + idMesa + "\nCapacidad=" + capacidad + "\nOcupada=" + ocupada  + ", estado=" + estado + '}';
    }

   
    

   


}

    
    
    


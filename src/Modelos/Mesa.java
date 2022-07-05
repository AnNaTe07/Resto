
package Modelos;

import java.time.LocalDate;

public class Mesa {
    
    private int idMesa; 
    private int capacidad;
    private boolean ocupada;
    private LocalDate fecha;
    private boolean activo;
    private String estado;

    public Mesa() {
    }

    public Mesa( int capacidad, boolean ocupada, LocalDate fecha, boolean activo, String estado) {
   
        this.capacidad = capacidad;
        this.ocupada = ocupada;
        this.fecha = fecha;
        this.activo = activo;
        this.estado = estado;
    }

    public Mesa(int idMesa, int capacidad, boolean ocupada, LocalDate fecha, boolean activo, String estado) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.ocupada = ocupada;
        this.fecha = fecha;
        this.activo = activo;
        this.estado = estado;
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

    public String getEstado() {
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

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa n°" + idMesa + "\nCapacidad=" + capacidad + "\nOcupada=" + ocupada  + ", estado=" + estado + '}';
    }

   
    

   


}

    
    
    


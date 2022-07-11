
package Modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private int idReserva;
    private String nombre;
    private long dni;
    private LocalDate fecha;
    private LocalTime hora;
    private int idMesa;
    private boolean activo;

    public Reserva() {
    }

    public Reserva( String nombre, long dni, LocalDate fecha, LocalTime hora, int idMesa, boolean activo) {
     
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.idMesa = idMesa;
        this.activo = activo;
    }

    public Reserva(int idReserva, String nombre, long dni, LocalDate fecha, LocalTime hora, int idMesa, boolean activo) {
        this.idReserva = idReserva;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.idMesa = idMesa;
        this.activo = activo;
    } 

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

 
    @Override
    public String toString() {
        return "Reserva n°: "+idReserva+"\nMesa n°=" + idMesa+ "\n Cliente=" + nombre +" \nDni:"+dni+ "\nFecha Y hora=" + fecha + ", "+hora+"hs";
    }
    
    
            
}

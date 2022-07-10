
package Modelos;

import java.sql.Time;
import java.time.LocalDate;

public class Reserva {
    private int idReserva;
    private String nombre;
    private int dni;
    private LocalDate fecha;
    private Time hora;
    private int idMesa;
    private boolean activo;

    public Reserva() {
    }

    public Reserva( String nombre, int dni, LocalDate fecha, Time hora, int idMesa, boolean activo) {
     
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.idMesa = idMesa;
        this.activo = activo;
    }

    public Reserva(int idReserva, String nombre, int dni, LocalDate fecha, Time hora, int idMesa, boolean activo) {
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

    public int getDni() {
        return dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Time getHora() {
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

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(Time hora) {
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

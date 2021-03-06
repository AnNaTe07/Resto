
package Modelos;

import java.util.List;

public class Mesero {
    private int idMesero;
    private String nombre;
    private String apellido;
    private int dni;
    private Long telefono;
    private boolean activo;

    
    //Constructores

    public Mesero() {
    }

    public Mesero(String nombre, String apellido, int dni, Long telefono, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Mesero(int idMesero, String nombre, String apellido, int dni, Long telefono, boolean activo) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Mesero(String nombre, String apellido, int dni, Long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }
    

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

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return this.nombre + " " + apellido;
    }
    
    
  
    
}


package Modelos;

public class Mesa {
    
    private int idMesa; 
    private int capacidad;
    private boolean activo;
    private String estado;

    public Mesa() {
    }

    public Mesa( int capacidad, boolean activo, String estado) {
   
        this.capacidad = capacidad;
        this.activo = activo;
        this.estado = estado;
    }

    public Mesa(int idMesa, int capacidad,  boolean activo, String estado) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.activo = activo;
        this.estado = estado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public int getCapacidad() {
        return capacidad;
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

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa: "+idMesa;
      //  return "Mesa n°" + idMesa + "\nCapacidad=" + capacidad +  ",\nestado=" + estado ;
    }    

   


}

    
    
    


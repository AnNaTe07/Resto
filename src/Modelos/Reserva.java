
package Modelos;

import java.util.Date;

/**
 *
 * @author Best smite LAS
 */
public class Reserva {
    private int idReserva;
    private int cliente;
    private Date fechaYhora;
    private int idMesa;
    private boolean reserva;

    public Reserva() {
    }

    public Reserva(int idReserva, int cliente, Date fechaYhora, int idMesa, boolean reserva) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.fechaYhora = fechaYhora;
        this.idMesa = idMesa;
        this.reserva = reserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public Date getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(Date fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", cliente=" + cliente + ", fechaYhora=" + fechaYhora + ", idMesa=" + idMesa + ", reserva=" + reserva + '}';
    }
    
    
            
}

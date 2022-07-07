
package Modelos;

public class DetallePedido {
    
    private int idDetalle;
    private Pedido dped;
    private Producto prod;

    private int cant;
    boolean expirado;


    public DetallePedido() {
    }

    public DetallePedido(Pedido dped, Producto prod, int cant, boolean expirado) {
        this.dped = dped;
        this.prod = prod;
        this.cant = cant;
        this.expirado = expirado;
    }

    public DetallePedido(int idDetalle, Pedido dped, Producto prod, int cant, boolean expirado) {
        this.idDetalle = idDetalle;
        this.dped = dped;
        this.prod = prod;
        this.cant = cant;
        this.expirado = expirado;
    }

    public Pedido getDped() {
        return dped;
    }

    public void setDped(Pedido dped) {
        this.dped = dped;
    }

    public boolean isExpirado() {
        return expirado;
    }

    public void setExpirado(boolean expirado) {
        this.expirado = expirado;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Pedido getPed() {
        return dped;
    }

    public void setPed(Pedido ped) {
        this.dped = ped;
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
        return "DetallePedido" + "idDetalle=" + idDetalle + ", ped=" + dped + ", prod=" + prod + ", cant=" + cant;

    }
    
}


package Modelos;

public class DetallePedido {
    
    private int idDetalle;
    private Pedido dped;
    private Producto prod;
    private int cant;

    public DetallePedido() {
    }

    public DetallePedido(Pedido dped, Producto prod, int cant) {
        this.dped = dped;
        this.prod = prod;
        this.cant = cant;
    }

    public DetallePedido(int idDetalle, Pedido dped, Producto prod, int cant) {
        this.idDetalle = idDetalle;
        this.dped = dped;
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

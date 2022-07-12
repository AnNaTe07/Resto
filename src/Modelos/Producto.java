package Modelos;

public class Producto {

    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private boolean activo;
    private int categoria;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, int cantidad, double precio, boolean activo, int categaoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.activo = activo;
        this.categoria = categaoria;
    }

    public Producto(String nombre, int cantidad, double precio, boolean activo, int categaoria) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.activo = activo;
        this.categoria = categaoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categaoria) {
        this.categoria = categaoria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", cantidad= " + cantidad + ", precio= " + precio + ", activo= " + activo + ", categaoria= " + categoria + '}';
    }

    

}

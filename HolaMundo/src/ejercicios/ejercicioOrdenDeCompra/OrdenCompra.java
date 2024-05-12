package ejercicios.ejercicioOrdenDeCompra;

import java.time.LocalDate;

public class OrdenCompra {

    private static int id = 0;
    private String descripcion;
    private LocalDate fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos = 0;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        id++;
        this.productos = new Producto[4];
    }

    public static int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto(Producto producto) {

        if (indiceProductos < productos.length) {
            this.productos[indiceProductos] = producto;
            indiceProductos++;
        }
        System.out.println("capacidad agotada");

    }

    public int getTotal() {
        int total = 0;

        for (Producto prod : this.productos) {
            total += prod.getPrecio();
        }
        return total;

    }

}

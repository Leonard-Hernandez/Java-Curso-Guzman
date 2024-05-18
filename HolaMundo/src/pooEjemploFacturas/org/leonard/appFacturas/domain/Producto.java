package pooEjemploFacturas.org.leonard.appFacturas.domain;

public class Producto {

    private int codigo;
    private String nombre;
    private Float precio;
    private static int ultimoCodigo;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

}

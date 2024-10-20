package apiStream.ejemplo.models;

public class Factura {

    private String descripcion;

    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return this.getDescripcion();
    }

}

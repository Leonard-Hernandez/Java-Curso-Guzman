package pooInterfacesRepositorio.modelo;

public class Producto extends BaseEntity{

    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio) {
        super();
        this.descripcion = descripcion;
        this.precio = precio;
    }

    

}

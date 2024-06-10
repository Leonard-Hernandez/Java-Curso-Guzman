package ejercicios.ejercicioCatalogoPoo.modelo;

import java.util.Date;

public class Libro extends Producto implements ILibro {

    private Date fechaPublicacion;
    private String autor;
    private String editorial;
    private String titulo;

    public Libro(int precio, String autor, String editorial, String titulo, Date fechaPublicacion) {
        super(precio);
        this.autor = autor;
        this.editorial = editorial;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public Double getPrecioVenta() {
        return this.precio * 1.2;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

}

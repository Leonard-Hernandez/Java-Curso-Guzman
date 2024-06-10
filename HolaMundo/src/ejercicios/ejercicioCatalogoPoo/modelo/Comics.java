package ejercicios.ejercicioCatalogoPoo.modelo;

import java.util.Date;

public class Comics extends Libro {

    private String personaje;

    public Comics(int precio, String autor, String editorial, String titulo, Date fechaPublicacion, String personaje) {
        super(precio, autor, editorial, titulo, fechaPublicacion);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public Double getPrecioVenta() {
        return this.precio * 1.3;
    }
}

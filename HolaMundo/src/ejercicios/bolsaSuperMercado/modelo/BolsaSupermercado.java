package ejercicios.bolsaSuperMercado.modelo;

import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> contenido;
    private int indice;
    public static final int MAX_PRODUCTOS = 5;

    public void addProducto(T t) {
        if (indice < MAX_PRODUCTOS) {
            contenido.add(t);
            indice++;
        }
    }

    public List<T> getProductos() {
        return this.contenido;
    }

}

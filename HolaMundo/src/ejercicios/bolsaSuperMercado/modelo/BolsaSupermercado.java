package ejercicios.bolsaSuperMercado.modelo;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> contenido;
    private int indice;
    public static final int MAX_PRODUCTOS = 5;

    public BolsaSupermercado(){
        this.contenido = new ArrayList<>();
    }

    public void addProducto(T t) {
        if (indice < MAX_PRODUCTOS) {
            contenido.add(t);
            indice++;
        }else{
            System.out.println("La bolsa esta llena");
        }
    }

    public List<T> getProductos() {
        return this.contenido;
    }

}

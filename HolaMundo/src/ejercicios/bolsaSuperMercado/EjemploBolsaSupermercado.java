package ejercicios.bolsaSuperMercado;

import ejercicios.bolsaSuperMercado.modelo.BolsaSupermercado;
import ejercicios.bolsaSuperMercado.modelo.Fruta;
import ejercicios.bolsaSuperMercado.modelo.Lacteo;
import ejercicios.bolsaSuperMercado.modelo.Limpieza;
import ejercicios.bolsaSuperMercado.modelo.NoPerecible;

public class EjemploBolsaSupermercado {

    public static void main(String[] args) {
        
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        bolsaLacteos.addProducto(new Lacteo("Leche", 10d, 1000, 50));
        bolsaLacteos.addProducto(new Lacteo("Yogurt", 15d, 10, 5));
        bolsaLacteos.addProducto(new Lacteo("Queso", 25d, 100, 20));
        bolsaLacteos.addProducto(new Lacteo("Crema", 20d, 50, 10));
        bolsaLacteos.addProducto(new Lacteo("Queso parmesano", 15d, 30, 5));
        
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.addProducto(new Limpieza("Desinfectante", 10d, "Cloro", 0.5));
        bolsaLimpieza.addProducto(new Limpieza("Jabón", 15d, "Cloro", 0.5));
        bolsaLimpieza.addProducto(new Limpieza("Shampoo", 20d, "Cloro", 0.5));
        bolsaLimpieza.addProducto(new Limpieza("Detergente", 10d, "Cloro", 0.5));
        bolsaLimpieza.addProducto(new Limpieza("Lavandina", 15d, "Cloro", 0.5));

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        bolsaFrutas.addProducto(new Fruta("Manzana", 5d, 0.5, "Rojo"));
        bolsaFrutas.addProducto(new Fruta("Pera", 5d, 0.5, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Naranja", 5d, 0.5, "Naranja"));
        bolsaFrutas.addProducto(new Fruta("Sandia", 5d, 0.5, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Papaya", 5d, 0.5, "Naranja"));

        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();
        bolsaNoPerecibles.addProducto(new NoPerecible("Coca-cola", 5d, 100, 100));
        bolsaNoPerecibles.addProducto(new NoPerecible("Pepsi", 5d, 100, 100));
        bolsaNoPerecibles.addProducto(new NoPerecible("Fanta", 5d, 100, 100));
        bolsaNoPerecibles.addProducto(new NoPerecible("Sprite", 5d, 100, 100));
        bolsaNoPerecibles.addProducto(new NoPerecible("Aquarius", 5d, 100, 100));

        bolsaLacteos.getProductos().forEach(System.out::println);
        System.out.println();
        bolsaLimpieza.getProductos().forEach(System.out::println);
        System.out.println();
        bolsaFrutas.getProductos().forEach(System.out::println);
        System.out.println();
        bolsaNoPerecibles.getProductos().forEach(System.out::println);

    }

}

package colecciones.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>((a,b) -> b.compareTo(a));
        /*no ordena por orden de agragacion, si no por orden alfabetico
        y puedemos agregar un comparator para modificar el orden */

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts " + ts);

        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("numericos " + numeros);

    }

}

package colecciones.set;

import java.util.HashSet;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println(hs);

        boolean b = hs.add("tres");
        System.out.println("el elemento se pudo agregar = "+ b);
        System.out.println(hs);
    }

}

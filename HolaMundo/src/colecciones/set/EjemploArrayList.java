package colecciones.set;

import java.util.ArrayList;
import java.util.List;

import colecciones.modelo.Alumno;

public class EjemploArrayList {

    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        System.out.println(sa + ", size = " + sa.size());
        System.out.println("esta vacia = " + sa.isEmpty());
        sa.add(new Alumno("Lubraska ", 10));
        sa.add(new Alumno("Leonard", 7));
        sa.add(new Alumno("Rodolfo", 4));
        sa.add(2, new Alumno("Santiago", 8));
        sa.set(3, new Alumno("Santiago", 8));
        sa.add(new Alumno("Jose", 1));
        System.out.println(sa + ", size = " + sa.size());
        //add empuja los demas, set lo modifica

        //sa.remove(new Alumno("Leonard", 7));
        sa.remove(1);
        System.out.println(sa + ", size = " + sa.size());

        boolean b = sa.contains(new Alumno("Leonard", 7));
        System.out.println("La lista contiene a Leonard = " + b);

        Object a[] = sa.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Desde el arreglo = "+ a[i]);
        }
    }

}

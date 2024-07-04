package colecciones.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import colecciones.modelo.Alumno;

public class EjemploListComparableComparator {

    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Lubraska ", 10));
        sa.add(new Alumno("Leonard", 7));
        sa.add(new Alumno("Rodolfo", 4));
        sa.add(new Alumno("Santiago", 8));
        sa.add(new Alumno("Jose", 1));
        sa.add(new Alumno("Jose", 12));
        //Collections.sort(sa, (a, b) -> b.getNombre().compareTo(a.getNombre()));
        //sa.sort((a, b) -> b.getNombre().compareTo(a.getNombre()));
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println(sa);

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }

}

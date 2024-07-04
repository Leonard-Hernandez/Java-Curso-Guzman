package colecciones.set;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import colecciones.modelo.Alumno;

public class EjemploTreeSetComparable {

    public static void main(String[] args) {
        
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNombre).reversed());
        sa.add(new Alumno("Lubraska ",10));
        sa.add(new Alumno("Leonard", 7));
        sa.add(new Alumno("Rodolfo", 4));
        sa.add(new Alumno("Santiago", 8));
        sa.add(new Alumno("Jose", 1));

        System.out.println(sa);


    }

}

package colecciones.set;

import java.util.HashSet;
import java.util.Set;

import colecciones.modelo.Alumno;

public class EjemploHashSetUnicidad {

    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Lubraska ", 10));
        sa.add(new Alumno("Leonard", 7));
        sa.add(new Alumno("Rodolfo", 4));
        sa.add(new Alumno("Santiago", 8));
        sa.add(new Alumno("Jose", 1));
        sa.add(new Alumno("Jose", 12));

        System.out.println(sa);

    }

}

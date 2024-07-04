package colecciones.set;

import java.util.HashSet;
import java.util.Iterator;
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

        System.out.println("Iterando usando foreach");
        for(Alumno a : sa){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> iterator = sa.iterator();
        while (iterator.hasNext()) {

            Alumno a = iterator.next();
            System.out.println(a.getNombre());
            
        }

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);


    }

}

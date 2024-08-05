package colecciones.list;

import colecciones.modelo.Alumno;
import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploLinkedList {

    public static void main(String[] args) {

        LinkedList<Alumno> sa = new LinkedList<>();
        System.out.println(sa + ", size = " + sa.size());
        System.out.println("esta vacia = " + sa.isEmpty());
        sa.add(new Alumno("Lubraska ", 10));
        sa.add(new Alumno("Leonard", 7));
        sa.add(new Alumno("Rodolfo", 4));
        sa.add(2, new Alumno("Santiago", 8));
        sa.add(new Alumno("Santiago", 8));
        sa.add(new Alumno("Jose", 1));
        System.out.println(sa + ", size = " + sa.size());

        System.out.println(sa + ", size = " + sa.size());

        sa.addFirst(new Alumno("Luis", 7));
        sa.addLast(new Alumno("Atenea", 6));

        System.out.println(sa + ", size = " + sa.size());
        // get lanza una execepcion si no lo encuentra
        System.out.println("Primero = " + sa.getFirst());
        // peek no lanza una excepcion si no encuentra
        System.out.println("Primero = " + sa.peekFirst());
        System.out.println("Ultimo = " + sa.getLast());
        System.out.println("Inidice 2 = " + sa.get(2));
        // remove retorna excepcion si no lo encuentra y poll no
        Alumno luis = sa.removeFirst();
        // Alumno luis = sa.pollFirst();
        // Alumno luis = sa.pop(); es equivalente a remove first
        Alumno atenea = sa.removeLast();

        System.out.println(luis + " " + atenea);

        sa.remove(new Alumno("Leonard", 7));

        System.out.println(sa + ", size = " + sa.size());

        System.out.println(sa.indexOf(new Alumno("Santiago", 8)));

        ListIterator<Alumno> li = sa.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("======= previos");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }

        // para usar estos metodos tiene que haber siguiente y previo en el cursor

    }

}

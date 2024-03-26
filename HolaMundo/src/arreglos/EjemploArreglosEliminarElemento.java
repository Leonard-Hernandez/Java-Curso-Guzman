package arreglos;

import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("ingrese una posicion para eliminar");
        int posicion = scanner.nextInt();

        for (int i = posicion; i < a.length-1; i++) {
            a[i] = a [i+1];
        }

        System.out.println("Arreglo original con el objeto elemininado");
        for (int i = 0; i < a.length-1; i++) {
            System.out.println(i + " -> " + a[i]);
            
        }

        int[] b = new int[a.length-1];
        System.arraycopy(a, 0, b,0, b.length);

        System.out.println("Arreglo copia");
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " -> " + b[i]);

        }



    }
}

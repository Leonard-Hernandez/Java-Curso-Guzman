package arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 9 numeros");
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Que numero quiere agregar");
        elemento = scanner.nextInt();

        System.out.println("En que posicion quiere agregarlo de 0 a 9");
        posicion = scanner.nextInt();

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("Arreglo Final: ");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        scanner.close();

    }
}

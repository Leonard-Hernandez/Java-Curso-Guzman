package arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion, ultimo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Que numero quiere agregar");
        elemento = scanner.nextInt();

        System.out.println("En que posicion quiere agregarlo de 0 a 9");
        posicion = scanner.nextInt();

        ultimo = a[a.length - 1];
        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[posicion] = elemento;
        b[b.length - 1] = ultimo;

        System.out.println("Arreglo Final: ");

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        scanner.close();

    }
}

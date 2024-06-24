package arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumeros {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\r\ningrese el numero a buscar");
        int num = scanner.nextInt();

        int i = 0;
        for (; i < a.length && a[i] != num; i++) {
        }
        if (i == a.length) {
            System.out.println("Numero no encontrado");
        } else if (a[i] == num) {
            System.out.println("El numero fue encontrado en la posicion: " + i);
        }

        scanner.close();

    }
}

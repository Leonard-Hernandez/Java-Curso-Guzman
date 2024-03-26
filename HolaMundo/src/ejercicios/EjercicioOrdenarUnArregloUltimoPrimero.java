package ejercicios;

import java.util.Scanner;

public class EjercicioOrdenarUnArregloUltimoPrimero {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Mostrando los numeros forma ultimo -> primero");
        for (int i = 0; i < a.length/2; i++) {
            System.out.println(a[a.length-1-i] + " -> " + a[i]);
        }

    }
}

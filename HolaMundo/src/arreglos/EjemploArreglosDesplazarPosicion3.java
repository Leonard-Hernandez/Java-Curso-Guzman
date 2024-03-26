package arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero, posicion;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 6 numeros");
        for (int i = 0; i < a.length-1; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el numero que desea agregar");
        numero = scanner.nextInt();

        posicion = 0;
        while(posicion<a.length-1 && numero > a[posicion]){
            posicion++;
        }

        for (int i = a.length-2; i >= posicion ; i--) {
            a[i+1] = a[i];
        }

        a[posicion] = numero;
        System.out.println("Nuevo arreglo ordenado");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " -> " + a[i]);
        }
    }
}

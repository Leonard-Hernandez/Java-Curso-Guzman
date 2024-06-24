package arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero, posicion, ultimo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el numero que desea agregar");
        numero = scanner.nextInt();

        ultimo = a[a.length-1];
        posicion = 0;
        while(posicion<a.length-1 && numero > a[posicion]){
            posicion++;
        }

        for (int i = a.length-2; i >= posicion ; i--) {
            a[i+1] = a[i];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);

        if(numero> ultimo){
            b[b.length-1] = numero;
        }else {
            b[b.length-1] = ultimo;
            b[posicion] = numero;
        }

        System.out.println("Nuevo arreglo ordenado");
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " -> " + b[i]);
        }

        scanner.close();
    }
}

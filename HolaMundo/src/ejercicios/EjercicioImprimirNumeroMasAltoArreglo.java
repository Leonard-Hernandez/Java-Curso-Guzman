package ejercicios;

import java.util.Scanner;

public class EjercicioImprimirNumeroMasAltoArreglo {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner scanner = new Scanner(System.in);
        int aux, mayor;
        System.out.println("Ingrese 7 numeros en el rango de 11 a 99");
        for (int i = 0; i < a.length; i++) {
            aux = scanner.nextInt();

            if (aux>=11 && aux<=99){
                a[i]=aux;
            }else {
                System.err.println("Numero fuera de rango");
                i--;
            }
        }

        mayor = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            mayor = a[i]>mayor ? a[i]:mayor;
        }

        System.out.println("El numero mayor es: " + mayor);
    }
}

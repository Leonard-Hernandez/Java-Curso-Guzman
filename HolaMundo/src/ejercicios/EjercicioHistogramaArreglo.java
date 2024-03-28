package ejercicios;

import java.util.Scanner;

public class EjercicioHistogramaArreglo {
    public static void main(String[] args) {

        int[] arreglo = new int[7];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 numeros del 1 al 6");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }

        /* 0 = 1,
           1 = 2,
           2 = 3,
           3 = 4,
           4 = 5,
           5 = 6*/
        int[] repeticion = new int[6];

        for (int i = 0; i < arreglo.length; i++) {
            switch (arreglo[i]){
                case 1:
                    repeticion[0]++;
                    break;
                case 2:
                    repeticion[1]++;
                    break;
                case 3:
                    repeticion[2]++;
                    break;
                case 4:
                    repeticion[3]++;
                    break;
                case 5:
                    repeticion[4]++;
                    break;
                case 6:
                    repeticion[6]++;
                    break;
            }
        }

        for (int i = 0; i < repeticion.length; i++) {
            System.out.print(i+1 + ": ");
            for (int j = 0; j < repeticion[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

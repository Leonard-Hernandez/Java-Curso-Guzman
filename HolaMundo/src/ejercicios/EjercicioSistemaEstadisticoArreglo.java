package ejercicios;

import java.util.Scanner;

public class EjercicioSistemaEstadisticoArreglo {
    public static void main(String[] args) {
        int[] a = new int[7];
        int aux, acumPos = 0, contPos = 0, acumNeg = 0,contNeg = 0, contCero = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 7 Numeros");
        for (int i = 0; i < a.length; i++) {
            aux = scanner.nextInt();

            if(aux ==0){
                contCero++;
            } else if (aux>0) {
                contPos++;
                acumPos += aux;
            } else {
                contNeg++;
                acumNeg +=aux;
            }

            a[i] = aux;
        }

        int proPos = acumPos/contPos;
        int proNeg = acumNeg/contNeg;

        System.out.println("El promedio de los numeros positivos fue: " + proPos);
        System.out.println("El promedio de lis numeros negativos fue: " + proNeg);
        System.out.println("El numero de ceros fue " + contCero);
    }
}

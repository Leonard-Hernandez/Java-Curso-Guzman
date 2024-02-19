package ejercicios;

import java.util.Scanner;

public class EjercicioSecuenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija el limite de la secuencia");
        int limite = scanner.nextInt();

        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        while(sum < limite){
            System.out.println(sum);
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

    }
}

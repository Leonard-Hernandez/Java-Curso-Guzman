package ejercicios;

import java.util.Scanner;

public class EjercicioMatrizDibujarSilla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("De que tamaño quiere la matriz (n x n)");
        int diagonal = scanner.nextInt();

        if (diagonal < 1){
            System.err.println("Erro la diagonal no puede ser menor a 1");
            System.exit(1);
        }

        int[][] matriz = new int[diagonal][diagonal];

        //modificamos la matriz solo en las para dibujar la silla
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (
                        (j == 0) ||
                        (i== matriz.length / 2) ||
                        ((i > matriz.length / 2 && j == matriz[i].length -1))
                ){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }

        //mostramos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

package ejercicios;

import java.util.Scanner;

public class EjercicioMatrizDibujarX {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("De que tamaño quiere la diagonal de la X");
        int diagonal = scanner.nextInt();

        if (diagonal < 1){
            System.err.println("Erro la diagonal no puede ser menor a 1");
            System.exit(1);
        }

        String[][] matriz = new String[diagonal][diagonal];

        //modificamos la matriz solo en las diagonales
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || j == matriz.length -1 - i){
                    matriz[i][j] = "X";
                }else{
                    matriz[i][j] = "_";
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

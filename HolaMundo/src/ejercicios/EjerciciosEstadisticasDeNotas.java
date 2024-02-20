package ejercicios;

import javax.swing.*;

public class EjerciciosEstadisticasDeNotas {
    public static void main(String[] args) {

        double nota = 0;

        double contadorMayor5 = 0;
        double acumuladorMeyor5 = 0;

        double contadorMenor4 = 0;
        double acumuladorMenor4 = 0;

        double acumuladorTotal = 0;

        int contadorNota1 = 0;

        for (int i = 0; i < 20; i++) {
            nota = Double.parseDouble(JOptionPane.showInputDialog(
                    "Ingrese la nota en escala de 1 a 7: " + (i + 1) + "/20"));

            if (nota < 1 || nota > 7) {
                System.out.println("Valor ingresado no valido");
                main(args);
            }

            if (nota >= 5) {
                contadorMayor5++;
                acumuladorMeyor5 += nota;
            }

            if (nota <= 4) {
                contadorMenor4++;
                acumuladorMenor4 += nota;
            }

            if (nota == 1) {
                contadorNota1 += 1;
            }

            acumuladorTotal += nota;

        }

        System.out.println("Promedio de las notas mayores a 5 = " + (acumuladorMeyor5 / contadorMayor5));
        System.out.println("Promedio de las notas menores a 4 = " + (acumuladorMenor4 / contadorMenor4));
        System.out.println("Promedio de las notas iguales a 1 = " + contadorNota1);
        System.out.println("Promedio de total de las notas = " + (acumuladorTotal / 20));


    }

}

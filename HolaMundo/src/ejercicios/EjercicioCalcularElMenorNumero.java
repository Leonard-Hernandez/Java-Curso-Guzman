package ejercicios;

import javax.swing.*;

public class EjercicioCalcularElMenorNumero {
    public static void main(String[] args) {

        Long min = Long.MAX_VALUE;

        int limite = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese la cantidad de numeros a comparar"));


        int i = 0;
        while (i < limite){

            Long num = Long.parseLong(JOptionPane.showInputDialog("Ingresa el numero "+ (i+1)));

            min = num < min ? num : min;

            i++;

        }
        System.out.println("El menor de los numeros es " + min);

    }

}

package ejercicios;

import javax.swing.*;

public class EjercicioNombreMasLargo {

    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese el primer nombre");

        String nombre2 = JOptionPane.showInputDialog("Ingrese el segundo nombre");

        String nombre3 = JOptionPane.showInputDialog("Ingrese el tercer nombre");

        String[] aux = new String[5];

        aux = nombre1.split(" ");
        nombre1 = aux[0];

        aux = nombre2.split(" ");
        nombre2 = aux[0];

        aux = nombre3.split(" ");
        nombre3 = aux[0];

        String nombreMasLargo = nombre1.length() > nombre2.length() ? nombre1:nombre2;
        nombreMasLargo = nombreMasLargo.length() > nombre3.length() ? nombreMasLargo:nombre3;

        System.out.println(nombreMasLargo.concat(" tiene el nombre mas largo"));

    }

}

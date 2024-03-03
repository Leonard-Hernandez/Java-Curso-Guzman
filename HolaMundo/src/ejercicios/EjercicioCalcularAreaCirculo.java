package ejercicios;

import javax.swing.*;
import java.net.DatagramPacket;

public class EjercicioCalcularAreaCirculo {
    public static void main(String[] args) {

        Double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));

        Double area = Math.PI * Math.pow(radio,2);

        JOptionPane.showMessageDialog(null,"El area del circulo es " + area);

    }
}

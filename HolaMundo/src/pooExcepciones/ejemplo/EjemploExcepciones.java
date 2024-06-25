package pooExcepciones.ejemplo;

import javax.swing.JOptionPane;

public class EjemploExcepciones {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Ingrese un entero");

        try {
            int divisor = Integer.parseInt(valor);
            int divicion = 10 / divisor;
            System.out.println(divicion);
        } catch (NumberFormatException ne) {
            System.out.println("Capturando la excepcion en tiempo de ejecucion " + ne.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("Capturando la excepcion en tiempo de ejecucion " + ae.getMessage());
        } finally {
            System.out.println("Es opcional, pero se ejecuta con o sin excepcion");
        }

        System.out.println("Continuamos con el flujo de nuestra aplicacion");

    }

}

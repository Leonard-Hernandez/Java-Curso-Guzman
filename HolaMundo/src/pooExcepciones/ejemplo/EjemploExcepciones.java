package pooExcepciones.ejemplo;

import javax.swing.JOptionPane;

public class EjemploExcepciones {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;
        Double divicion;

        try {
            divisor = Integer.parseInt(valor);
            divicion = cal.dividir(divisor, 10);
            System.out.println(divicion);
        } catch (NumberFormatException ne) {
            System.out.println("Capturando la excepcion en tiempo de ejecucion " + ne.getMessage());
        } catch (DivicionPorZeroException ae) {
            System.out.println("Capturando la excepcion en tiempo de ejecucion " + ae.getMessage());
        } finally {
            System.out.println("Es opcional, pero se ejecuta con o sin excepcion");
        }

        System.out.println("Continuamos con el flujo de nuestra aplicacion");

    }

}

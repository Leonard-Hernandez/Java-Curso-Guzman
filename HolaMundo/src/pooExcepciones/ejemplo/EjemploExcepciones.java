package pooExcepciones.ejemplo;

import javax.swing.JOptionPane;

public class EjemploExcepciones {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;
        Double division;

        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10, divisor);
            System.out.println(division);

            double division2 = cal.dividir("s", "4");
            System.out.println("division 2 = " + division2);

        } catch (NumberFormatException ne) {
            System.out.println("Capturando la excepcion en tiempo de ejecucion " + ne.getMessage());
        } catch (DivicionPorZeroException ae) {
            System.out.println("Capturando la excepcion en tiempo de ejecucion " + ae.getMessage());
        } catch (FormatoNumeroException e) {
            System.out.println("Se dectecto una excepcion de numero valido" + e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Es opcional, pero se ejecuta con o sin excepcion");
        }

        System.out.println("Continuamos con el flujo de nuestra aplicacion");

    }

}

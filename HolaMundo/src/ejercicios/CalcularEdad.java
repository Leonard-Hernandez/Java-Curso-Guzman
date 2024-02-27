package ejercicios;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcularEdad {
    public static void main(String[] args) {
        Date fechaNacimiento;
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            fechaNacimiento = format.parse(JOptionPane.showInputDialog("Ingrese la fecha de naciemiento con el formato dd-MM-yyyy"));
        } catch (ParseException e) {
            System.out.println("El formato de la fecha es errada");
            throw new RuntimeException(e);
        }

        Date fechaActual = new Date();

        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        JOptionPane.showMessageDialog(null, " la edad es : " +edad);

    }
}

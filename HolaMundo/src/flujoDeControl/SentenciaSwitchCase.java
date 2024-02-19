package flujoDeControl;

import javax.swing.*;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del mes"));
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "No se encontro el mes";
        }

        System.out.println("El nombre del mes es ".concat(nombreMes));


        char num = '0';

        switch (num){
            case '0':
                System.out.println("El num es 0");
                break;
            case '1':
                System.out.println("El num es 1");
                break;
            case '2':
                System.out.println("El num es 2");
                break;
            case '3':
                System.out.println("El num es 3");
                break;
            default:
                System.out.println("Numero o caracter deconocido");

        }

        String nombre = "pepe";

        switch (nombre){
            case "admin":
                System.out.println("Bienvenido admin");
                break;
            case "leonard":
                System.out.println("Bienvenido leonard");
            case "pepe":
                System.out.println("Bienvenido pepe");
                break;
            default:
                System.out.println("Usuario desconocido");

        }
    }
}

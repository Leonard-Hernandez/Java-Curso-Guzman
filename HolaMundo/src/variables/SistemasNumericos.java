package variables;

import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Solo se aceptan numeros");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario ="numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroDecimal);

        String mensajeOctal = "numero octal de " + numeroDecimal+ " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) ;
        System.out.println( mensajeHex);
        int numero = 0x1f4;

        System.out.println("numero = " + numero);

        String mensaje = mensajeBinario;
        mensaje += System.lineSeparator() + mensajeOctal;
        mensaje += System.lineSeparator() + mensajeHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }

}

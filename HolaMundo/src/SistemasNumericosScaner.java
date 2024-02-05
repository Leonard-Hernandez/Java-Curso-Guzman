import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScaner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero");

        int numeroDecimal = 0;

        try{
            numeroDecimal = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Solo se aceptan numeros");
            main(args);
            System.exit(0);
        }


        String mensajeBinario ="numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String mensajeOctal = "numero octal de " + numeroDecimal+ " = " + Integer.toOctalString(numeroDecimal);

        String mensajeHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) ;

        String mensaje = mensajeBinario;
        mensaje += System.lineSeparator() + mensajeOctal;
        mensaje += System.lineSeparator() + mensajeHex;
        System.out.println(mensaje);
    }

}

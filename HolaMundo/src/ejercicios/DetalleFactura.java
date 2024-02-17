package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleFactura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la descripcion de la factura");
        String descripcion = scanner.nextLine();

        double producto1 = 0;
        double producto2 = 0;

        try{

            System.out.println("Introduzca el precio del primer producto");
            producto1 = scanner.nextDouble();

            System.out.println("Introduzca el precio del segundo producto");
            producto2 = scanner.nextDouble();

        }catch (InputMismatchException e){
            System.out.println("Solo se aceptan numeros en precios");
            main(args);
            System.exit(0);

        }

        double totalSinImpuestos = producto1+producto2;
        double impuestos = (producto1+producto2)* 0.19;

        String factura = String.format("La factura: %s tiene un total bruto de %.3f , con um impuesto de %.3f y el monto despues de impuestos es de %.3f",
        descripcion, totalSinImpuestos, impuestos, (totalSinImpuestos+impuestos) );

        System.out.println(factura);



    }

}

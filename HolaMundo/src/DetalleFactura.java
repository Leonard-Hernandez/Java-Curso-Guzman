import java.util.Scanner;

public class DetalleFactura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la descripcion de la factura");
        String descripcion = scanner.nextLine();

        System.out.println("Introduzca el precio del primer producto");
        double producto1 = scanner.nextDouble();

        System.out.println("Introduzca el precio del segundo producto");
        double producto2 = scanner.nextDouble();

        double totalSinImpuestos = producto1+producto2;
        double impuestos = (producto1+producto2)* 0.19;

        String factura = String.format("La factura: %s tiene un total bruto de %.3f , con um impuesto de %.3f y el monto despues de impuestos es de %.3f",
        descripcion, totalSinImpuestos, impuestos, (totalSinImpuestos+impuestos) );

        System.out.println(factura);



    }

}

package pooEjemploFacturas.org.leonard.appFacturas;

import java.util.Scanner;

import pooEjemploFacturas.org.leonard.appFacturas.domain.*;

public class EjemploFactura {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Leonard");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la Factura");
        Factura factura = new Factura(sc.nextLine(), cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {

            producto = new Producto();
            System.out.println("Ingrese producto No " + producto.getCodigo() + ": ");
            producto.setNombre(sc.nextLine());

            System.out.println("Ingrese el pholarecio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.println("Ingrese la cantidad: "); 
            factura.addItemFactura(new ItemFactura(sc.nextInt(), producto));

            System.out.println();
            sc.nextLine();
        }

        sc.close();

        System.out.println(factura);

    }

}

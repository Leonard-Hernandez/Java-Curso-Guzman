package pooEjemploFacturas.org.leonard.appFacturas;

import java.util.Scanner;

import pooEjemploFacturas.org.leonard.appFacturas.domain.Cliente;
import pooEjemploFacturas.org.leonard.appFacturas.domain.Factura;
import pooEjemploFacturas.org.leonard.appFacturas.domain.ItemFactura;
import pooEjemploFacturas.org.leonard.appFacturas.domain.Producto;

public class EjemploFactura {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Leonard");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la descripción de la Factura");
        String descrip = sc.nextLine();
        Factura factura = new Factura(descrip, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cant;

        System.out.println();

        for (int i = 0; i < 5; i++) {

            producto = new Producto();
            System.out.println("Ingrese producto No " + producto.getCodigo() + ": ");
            nombre = sc.nextLine();
            producto.setNombre(nombre);

            System.out.println("Ingrese el precio: ");
            precio = sc.nextFloat();
            producto.setPrecio(precio);

            System.out.println("Ingrese la cantidad: ");
            cant = sc.nextInt();
            ItemFactura item = new ItemFactura(cant, producto);
            factura.addItemFactura(item);

            System.out.println();
            sc.nextLine();
        }

        sc.close();

        System.out.println(factura.generarDetalle());

    }

}

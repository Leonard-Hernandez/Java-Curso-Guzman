package ejercicios.ejercicioOrdenDeCompra;

import java.time.LocalDate;

public class EjemploOrdenes {

    public static void main(String[] args) {
        
        Cliente leonard = new Cliente("Leonard", "Hernandez");
        OrdenCompra ordenLeonard = new OrdenCompra("Compras limpieza");
        ordenLeonard.setCliente(leonard);
        ordenLeonard.setFecha(LocalDate.now());
        ordenLeonard.addProducto(new Producto("P&G", "HeadShoulder", 25000));
        ordenLeonard.addProducto(new Producto("dove", "Jabom Cara", 12000));
        ordenLeonard.addProducto(new Producto("EGO", "Gel para cabello", 10000));
        ordenLeonard.addProducto(new Producto("Gillete", "afeitadora", 14400));

        System.out.println("Id:" + ordenLeonard.getId());
        System.out.println("Cliente:" + ordenLeonard.getCliente().getNombre());
        System.out.println("Fecha:" + ordenLeonard.getFecha());
        for(Producto prod : ordenLeonard.getProductos()){
            System.out.println("Fabricante: " + prod.getFabricante() + " Nombre: " + prod.getNombre() + " Precio: " + prod.getPrecio());
        }
        System.out.println("Total: " + ordenLeonard.getTotal());

        


    }

}

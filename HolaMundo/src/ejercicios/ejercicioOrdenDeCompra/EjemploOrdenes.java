package ejercicios.ejercicioOrdenDeCompra;

import java.time.LocalDate;

public class EjemploOrdenes {

    public static void main(String[] args) {
        
        Cliente leonard = new Cliente("Leonard", "Hernandez");
        OrdenCompra ordenLeonard = new OrdenCompra("Compras Higiene Personal");
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

        Cliente Lubraska = new Cliente("Lubraska", "Ferreira");
        OrdenCompra ordenLubraska = new OrdenCompra("Compras limpieza");
        ordenLubraska.setCliente(Lubraska);
        ordenLubraska.setFecha(LocalDate.now());
        ordenLubraska.addProducto(new Producto("Fabuloso", "Fabuloso mora", 15000));
        ordenLubraska.addProducto(new Producto("Axion", "Lava Loza", 10000));
        ordenLubraska.addProducto(new Producto("Familiar", "Papel Higienico", 15000));
        ordenLubraska.addProducto(new Producto("D1", "Trapero", 20000));

        System.out.println("Id:" + ordenLubraska.getId());
        System.out.println("Cliente:" + ordenLubraska.getCliente().getNombre());
        System.out.println("Fecha:" + ordenLubraska.getFecha());
        for(Producto prod : ordenLubraska.getProductos()){
            System.out.println("Fabricante: " + prod.getFabricante() + " Nombre: " + prod.getNombre() + " Precio: " + prod.getPrecio());
        }
        System.out.println("Total: " + ordenLubraska.getTotal());

        Cliente gleyzandry = new Cliente("Gleyzandry", "Parra");
        OrdenCompra ordenGleyzandry = new OrdenCompra("Compras mercado");
        ordenGleyzandry.setCliente(gleyzandry);
        ordenGleyzandry.setFecha(LocalDate.now());
        ordenGleyzandry.addProducto(new Producto("Nutos", "almendras", 5000));
        ordenGleyzandry.addProducto(new Producto("Coca Cola", "Coca Cola", 10000));
        ordenGleyzandry.addProducto(new Producto("Papa", "Papa criolla", 10000));
        ordenGleyzandry.addProducto(new Producto("Cafe", "Cafe", 10000));

        System.out.println("Id:" + ordenGleyzandry.getId());
        System.out.println("Cliente:" + ordenGleyzandry.getCliente().getNombre());
        System.out.println("Fecha:" + ordenGleyzandry.getFecha());
        for(Producto prod : ordenGleyzandry.getProductos()){            
            System.out.println("Fabricante: " + prod.getFabricante() + " Nombre: " + prod.getNombre() + " Precio: " + prod.getPrecio());
        }
        System.out.println("Total: " + ordenGleyzandry.getTotal());
        


    }

}

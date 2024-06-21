package pooInterfacesRepositorio;

import java.util.List;

import pooInterfacesRepositorio.modelo.Cliente;
import pooInterfacesRepositorio.modelo.Producto;
import pooInterfacesRepositorio.repositorio.Dirrecion;
import pooInterfacesRepositorio.repositorio.OrdenablePaginableCrudRepositorio;
import pooInterfacesRepositorio.repositorio.Lista.ClienteListRepositorio;
import pooInterfacesRepositorio.repositorio.Lista.ProductoListRepositorio;

public class EjemploRepositorioProducto {

    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Mesa", 500d));
        repo.crear(new Producto("Silla", 55d));
        repo.crear(new Producto("Lampara", 15d));
        repo.crear(new Producto("Escritorio", 80d));
        repo.crear(new Producto("Nevera", 1000d));

        List<Producto> productos = repo.listar();

        System.out.println("Total de registros: " + repo.total());

        productos.forEach(System.out::println);

        System.out.println("===== PAGINADO =====");
        List<Producto> productos2 = repo.listar(2, 4);
        productos2.forEach(System.out::println);

        System.out.println("===== ORDENADO =====");
        List<Producto> productos3 = repo.listar("precio", Dirrecion.DESC);
        productos3.forEach(System.out::println);

        System.out.println("===== editar =====");
        System.out.println("Antes: " + repo.porId(3));

        Producto actualizar = new Producto("escritorio 2", 100d);
        actualizar.setId(4);
        repo.editar(actualizar);
        System.out.println("Despues: " + repo.porId(3));

        System.out.println("===== eliminar =====");
        repo.eliminar(3);
        repo.listar().forEach(System.out::println);

        System.out.println("Total de registros: " + repo.total());

    }

}

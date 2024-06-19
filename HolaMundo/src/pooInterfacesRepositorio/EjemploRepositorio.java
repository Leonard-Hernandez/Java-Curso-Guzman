package pooInterfacesRepositorio;

import java.util.List;

import pooInterfacesRepositorio.modelo.Cliente;
import pooInterfacesRepositorio.repositorio.ClienteListRepositorio;
import pooInterfacesRepositorio.repositorio.Dirrecion;
import pooInterfacesRepositorio.repositorio.OrdenablePaginableCrudRepositorio;

public class EjemploRepositorio {

    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Leonard", "Hernandez"));
        repo.crear(new Cliente("Lubraska", "Ferreira"));
        repo.crear(new Cliente("Jose", "Perez"));
        repo.crear(new Cliente("Luis", "Gonzalez"));
        repo.crear(new Cliente("Maria", "Gonzalez"));

        List<Cliente> clientes = repo.listar();

        System.out.println("Total de registros: " + repo.total());

        clientes.forEach(System.out::println);

        System.out.println("===== PAGINADO =====");
        List<Cliente> clientes2 = repo.listar(2, 4);
        clientes2.forEach(System.out::println);

        System.out.println("===== ORDENADO =====");
        List<Cliente> clientes3 = repo.listar("nombre", Dirrecion.ASC);
        clientes3.forEach(System.out::println);

        System.out.println("===== editar =====");
        System.out.println("Antes: " + repo.porId(3));

        Cliente actualizar = new Cliente("Luis luis", "Gonzalez 2");
        actualizar.setId(3);
        repo.editar(actualizar);
        System.out.println("Despues: " + repo.porId(3));

        System.out.println("===== eliminar =====");
        repo.eliminar(3);
        repo.listar().forEach(System.out::println);

    }

}

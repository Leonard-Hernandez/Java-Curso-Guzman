package pooInterfacesRepositorio.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pooInterfacesRepositorio.modelo.Cliente;

public class EjemploGenericos {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Leonard", "Hernandez"));

        Cliente leonard = (Cliente) clientes.get(0);

        Cliente[] clientesArreglo = { new Cliente("Leonard", "Hernandez"), new Cliente("Lubraska", "Ferreira") };

        Integer[] enteros = {1, 2, 3, 4, 5};

        List<Cliente> clientes2 = fromArraytoList(clientesArreglo);
        List<Integer> enteros2 = fromArraytoList(enteros);

        clientes2.forEach(System.out::println);
        enteros2.forEach(System.out::println);

        List<Cliente> clientesArreglo2 = fromArraytoList(clientesArreglo,clientesArreglo);

    }

    public static <T> List<T> fromArraytoList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T,G> List<T> fromArraytoList(T[] c, G[] x) {
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
}
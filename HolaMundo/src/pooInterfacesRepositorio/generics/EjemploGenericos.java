package pooInterfacesRepositorio.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pooInterfacesRepositorio.modelo.Cliente;
import pooInterfacesRepositorio.modelo.ClientePremium;

public class EjemploGenericos {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Leonard", "Hernandez"));

        Cliente leonard = (Cliente) clientes.get(0);
        System.out.println(leonard);

        Cliente[] clientesArreglo = { new Cliente("Leonard", "Hernandez"), new Cliente("Lubraska", "Ferreira") };

        Integer[] enteros = { 1, 2, 3, 4, 5 };

        List<Cliente> clientes2 = fromArraytoList(clientesArreglo);
        List<Integer> enteros2 = fromArraytoList(enteros);

        imprimirClientes(clientes2);
        enteros2.forEach(System.out::println);

        List<Cliente> clientesArreglo2 = fromArraytoList(clientesArreglo, clientesArreglo);
        imprimirClientes(clientesArreglo2);

        List<ClientePremium> clientePremiumsList = fromArraytoList(new ClientePremium[] {
                new ClientePremium("Leonard", "Hernandez"), new ClientePremium("Lubraska", "Ferreira") });
        imprimirClientes(clientePremiumsList);

        System.out.println("Maximo de 1, 5, 2: "+maximo(1, 5, 2));
        System.out.println("Maximo de 1.5, 5.7, 2.4: "+maximo(1.5, 5.7, 2.4));
        System.out.println("Maximo de zapato, camisa, pantalon: "+maximo("zapato", "camisa", "pantalon"));
    }

    public static <T> List<T> fromArraytoList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArraytoList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArraytoList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArraytoList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}
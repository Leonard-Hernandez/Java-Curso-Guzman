package apiStream.ejemplo;

import apiStream.ejemplo.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        boolean existe = Stream
                .of("leonard hernandez", "Lubraska ferreira", "Andres guzman", "Jose jose", "Luis miguel",
                        "Pepe Garcia", "Pepe Jose")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(8));

        System.out.println(existe);

    }
}

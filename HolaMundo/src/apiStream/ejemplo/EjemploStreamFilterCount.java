package apiStream.ejemplo;

import apiStream.ejemplo.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {

        Long count = Stream
                .of("leonard hernandez", "Lubraska ferreira", "Andres guzman", "Jose jose", "Luis miguel",
                        "Pepe Garcia", "Pepe Jose")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);

    }
}

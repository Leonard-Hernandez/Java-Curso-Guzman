package apiStream.ejemplo;

import apiStream.ejemplo.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream.of("leonard hernandez", "Lubraska ferreira", "Andres guzman", "Lubraska ferreira", "Jose jose", "Luis miguel",
                        "Pepe Garcia", "Pepe Jose", "Lubraska ferreira", "Lubraska ferreira")
                .distinct()
                .forEach(System.out::println);

    }
}

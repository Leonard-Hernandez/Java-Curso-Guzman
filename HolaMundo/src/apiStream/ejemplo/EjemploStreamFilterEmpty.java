package apiStream.ejemplo;

import apiStream.ejemplo.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        Long count = Stream
                .of("leonard hernandez", "Lubraska ferreira", "", "Jose jose", "",
                        "Pepe Garcia", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count = " + count);

    }
}

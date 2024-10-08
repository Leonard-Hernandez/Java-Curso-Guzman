package apiStream.ejemplo;

import java.util.stream.Stream;

import apiStream.ejemplo.models.Usuario;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

        Usuario usuario = Stream
                .of("leonard hernandez", "Lubraska ferreira", "Andres guzman", "Jose jose", "Luis miguel",
                        "Pepe Garcia", "Pepe Jose")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(2)).findFirst().get();

        System.out.println(usuario);

    }
}

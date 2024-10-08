package apiStream.ejemplo;

import java.util.Optional;
import java.util.stream.Stream;

import apiStream.ejemplo.models.Usuario;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("leonard hernandez", "Lubraska ferreira", "Andres guzman", "Jose jose", "Luis miguel",
                        "Pepe Garcia", "Pepe Jose")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);
        // nombres.forEach(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario.get().getApellido());

    }
}

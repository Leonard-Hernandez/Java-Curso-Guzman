package apiStream.ejemplo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import apiStream.ejemplo.models.Usuario;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("leonard hernandez", "Lubraska ferreira", "Andres guzman", "Jose jose", "Luis miguel",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if (u.getNombre().equals("Lubraska")) {
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);
        // nombres.forEach(System.out::println);

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(u -> System.out.println(u.getApellido()));

    }
}

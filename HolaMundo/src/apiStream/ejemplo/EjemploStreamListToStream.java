package apiStream.ejemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import apiStream.ejemplo.models.Usuario;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("Lubraska", "Ferreira"));
        listaUsuarios.add(new Usuario("Leonard", "Hernandez"));
        listaUsuarios.add(new Usuario("Andres", "Guzman"));
        listaUsuarios.add(new Usuario("Jose", "Jose"));
        listaUsuarios.add(new Usuario("Luis", "Miguel"));

        Stream<?> nombres = listaUsuarios.stream()
                .map(u -> u.getNombre().toUpperCase()
                .concat(" ")
                .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("LUBRASKA")) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);
        
        System.out.println(nombres.count());

    }
}

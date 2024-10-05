package apiStream.ejemplo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import apiStream.ejemplo.models.Usuario;

public class EjemploStreamMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("leonard hernandez", "Lubraska ferreira", "Andres guzman", "Jose jose", "Luis miguel")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(u -> System.out.println(u.getNombre()))
                .map(usuario -> {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });
        //nombres.forEach(System.out::println);

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(u -> System.out.println(u.getApellido()));

    }
}

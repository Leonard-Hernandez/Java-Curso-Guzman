package apiStream.ejemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import apiStream.ejemplo.models.Usuario;

public class EjemploStreamParallel {
    public static void main(String[] args) {

        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("Lubraska", "Ferreira"));
        listaUsuarios.add(new Usuario("Leonard", "Hernandez"));
        listaUsuarios.add(new Usuario("Andres", "Guzman"));
        listaUsuarios.add(new Usuario("Jose", "Jose"));
        listaUsuarios.add(new Usuario("Luis", "Miguel"));

        long t1 = System.currentTimeMillis();
        String nombres = listaUsuarios.stream()
                .parallel()
                .map(u -> u.toString())
                .peek(System.out::println)
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    if (nombre.contains("Luis")) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        System.out.println(nombres);

    }
}

package java8lambda;

import java8lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {

    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + " tiene " + edad + " años");

        consumidorBi.accept("leonard", 19);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("holaa");

        List<String> nombres = Arrays.asList("Lubraska", "Leonard", "Andrez");

        nombres.forEach(consumidor2);

        Usuario usuario = new Usuario();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario,"Leonard");

        System.out.println(usuario.getNombre());

        Supplier<String> proveedor = () -> {
            return "Hola mundo lambda supplier";
        };

        System.out.println(proveedor.get());



    }

}

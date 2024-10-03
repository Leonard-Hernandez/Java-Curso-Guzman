package apiStream.ejemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("leonard", "Lubraska", "Andres", "Jose", "Luis");
        nombres.forEach(System.out::println);

        System.out.println("-------------");

        String[] arr = {"leonard", "Lubraska", "Andres", "Jose", "Luis"};
        Stream<String> nombres2 = Arrays.stream(arr);
        nombres2.forEach(System.out::println);

        System.out.println("-------------");
        Stream<String> nombres3 = Stream.<String>builder().add("Leonard")
                .add("Lubraska")
                .add("Andres")
                .add("Jose")
                .add("Luis")
                .build();

        nombres3.forEach(System.out::println);

        System.out.println("-------------");
        List<String> lista = new ArrayList<>();
        lista.add("Leonard");
        lista.add("Lubraska");
        lista.add("Andres");
        lista.add("Jose");
        lista.add("Luis");

        Stream<String> nombres4 = lista.stream();
        nombres4.forEach(System.out::println);

        System.out.println("-------------");
        lista.stream().forEach(System.out::println);



    }
}

package apiStream.ejemplo;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("leonard hernandez", "Lubraska ferreira", "Andres guzman", "Lubraska ferreira", "Jose jose", "Luis miguel",
                        "Pepe Garcia", "Pepe Jose", "Lubraska ferreira", "Lubraska ferreira")
                .distinct();

        String resultado = nombres.reduce("resultado concatenacion", (a,b) -> a + ", " + b);
        System.out.println("resultado = " + resultado);
    }
}

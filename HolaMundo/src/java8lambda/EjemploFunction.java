package java8lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "hola que tal " + param;
        String resultado = f1.apply("Leonard");
        System.out.println(resultado);

        Function<String, String> f2 = String::toUpperCase;
        String resultado2 = f2.apply("leonard");
        System.out.println(resultado2);

        BiFunction<String, String, String> biF3 = (a, b) -> a.toUpperCase().concat(" ").concat(b.toUpperCase());
        String resultado3 = biF3.apply("Leonard", "Hernandez");
        System.out.println(resultado3);

        BiFunction<String, String, Integer> biF4 = String::compareTo;
        Integer resultado4 = biF4.apply("leonard", "leonard");
        System.out.println(resultado4);

        BiFunction<String, String, String> biF5 = String::concat;
        String resultado5 = biF5.apply("leonard", "leonard");
        System.out.println(resultado5);
    }
}

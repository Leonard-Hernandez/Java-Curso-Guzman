package apiStream.ejemplo;

import apiStream.ejemplo.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        IntStream largoNombres = Stream
                .of("leonard hernandez", "Lubraska ferreira", "Andres guzman", "Jose jose", "Luis miguel",
                        "Pepe Garcia", "Pepe Jose", "Jose jose", "Jose jose", "Jose jose")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        //largoNombres.forEach(System.out::println);
        IntSummaryStatistics stats = largoNombres.summaryStatistics();

        System.out.println("min " + stats.getMin());
        System.out.println("max " + stats.getMax());
        System.out.println("sum " + stats.getSum());
        System.out.println("avg " + stats.getAverage());
        System.out.println("count " + stats.getCount());
        

    }
}

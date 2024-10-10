package apiStream.ejemplo;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        IntStream numeros = IntStream.range(5,20).peek(System.out::println);

        //Integer resultado = numeros.sum();
        //System.out.println("resultado = " + resultado);

        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println("min " + stats.getMin());
        System.out.println("max " + stats.getMax());
        System.out.println("sum " + stats.getSum());
        System.out.println("avg " + stats.getAverage());
        System.out.println("count " + stats.getCount());

    }
}

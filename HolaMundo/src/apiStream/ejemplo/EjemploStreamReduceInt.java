package apiStream.ejemplo;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        Stream<Integer> nombres = Stream.of(2,3,5,61,2,3,54,1,1,2);

        Integer resultado = nombres.reduce(0, Integer::sum);
        System.out.println("resultado = " + resultado);
    }
}

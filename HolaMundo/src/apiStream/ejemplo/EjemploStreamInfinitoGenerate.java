package apiStream.ejemplo;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {
    public static void main(String[] args) {
        
        Stream.generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return "hola mundo";
        }).limit(20).forEach(System.out::println);

    }
}

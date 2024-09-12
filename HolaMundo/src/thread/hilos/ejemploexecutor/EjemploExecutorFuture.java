package thread.hilos.ejemploexecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class EjemploExecutorFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea....");
            try {
                System.out.println("nombre thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Fin de la tarea");
            return "Algun resultado importante de la tarea";

        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Inicio de la tarea....");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Fin de la tarea");
            return 20;

        };
        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);
        executor.shutdown();
        System.out.println("continuando con la ejecucion del main");

        // System.out.println(resultado.isDone());
        while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())) {

            System.out.println(String.format("resultado 1 %s - resultado 2 %s - resultado 3 %s",
                    resultado.isDone(), resultado2.isDone(), resultado3.isDone()));
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        
        System.out.println(resultado.get());
        System.out.println(resultado2.get());
        System.out.println(resultado3.get());
        System.out.println(resultado.isDone());

    }

}

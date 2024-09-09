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
        
        ExecutorService executor = Executors.newSingleThreadExecutor();

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

        Future<String> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("continuando con la ejecucion del main");

        //System.out.println(resultado.isDone());
        while (!resultado.isDone()) {

            System.out.println("ejecutando tarea");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println(resultado.get());
        System.out.println(resultado.isDone());

    }

}

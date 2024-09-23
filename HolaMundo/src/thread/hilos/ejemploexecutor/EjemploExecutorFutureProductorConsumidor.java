package thread.hilos.ejemploexecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeoutException;

import thread.hilos.ejemplosync.Panaderia;
import thread.hilos.ejemplosync.runnable.Consumidor;
import thread.hilos.ejemplosync.runnable.Panadero;

public class EjemploExecutorFutureProductorConsumidor {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("tamaño del pool " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola " + executor.getQueue().size());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> future1 = executor.submit(productor);
        Future<?> future2 = executor.submit(consumidor);

        System.out.println("tamaño del pool " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola " + executor.getQueue().size());
        
        executor.shutdown();
        System.out.println("continuando con la ejecucion del main");

    }

}

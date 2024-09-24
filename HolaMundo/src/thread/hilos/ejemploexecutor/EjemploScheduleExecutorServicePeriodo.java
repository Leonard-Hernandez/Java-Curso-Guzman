package thread.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploScheduleExecutorServicePeriodo {

    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("alguna tarea del main");

        CountDownLatch lock = new CountDownLatch(5);

        Future<?> future = executor.scheduleAtFixedRate( () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(50);
                lock.countDown();

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("hola mundo tarea ");
        }, 1000l, 2000l, TimeUnit.MILLISECONDS);

        System.out.println("Alguna otra tarea");

        try {
            lock.await();
            future.cancel(true);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Alguna otra tarea");
        executor.shutdown();

    }
}

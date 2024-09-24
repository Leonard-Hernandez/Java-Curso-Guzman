package thread.hilos.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduleExecutorService {

    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("alguna tarea del main");

        executor.schedule( () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(50);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("hola mundo tarea");
        }, 0l, TimeUnit.MILLISECONDS);

        System.out.println("Alguna otra tarea");

        executor.shutdownNow();

    }
}

package ejercicios.ejercicioHilosAlfanumericos;

import ejercicios.ejercicioHilosAlfanumericos.domain.TaskAlphanumeric;
import ejercicios.ejercicioHilosAlfanumericos.domain.Type;

import java.util.concurrent.*;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(8);

        executor.scheduleAtFixedRate(new TaskAlphanumeric(Type.NUMERO), 0l, 3000l, TimeUnit.MILLISECONDS);
        executor.scheduleAtFixedRate(new TaskAlphanumeric(Type.LETRA), 0l, 2000l, TimeUnit.MILLISECONDS);

        TimeUnit.MILLISECONDS.sleep(10000);
        executor.shutdown();
    }

}

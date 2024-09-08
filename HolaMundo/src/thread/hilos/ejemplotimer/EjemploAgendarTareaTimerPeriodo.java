package thread.hilos.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {

    public static void main(String[] args) {

        AtomicInteger contadorAtomic = new AtomicInteger(3);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if (i > 0) {
                    System.out.println("Tarea periodica " + i + " en: " + new Date() + " nombre del thread: "
                            + Thread.currentThread().getName());

                } else {
                    System.out.println("finaliza el tiempo");
                    timer.cancel();

                }

            }

        }, 5000, 10000);

        System.out.println("agendamos una tarea para 5 segundos mas ...");

    }

}

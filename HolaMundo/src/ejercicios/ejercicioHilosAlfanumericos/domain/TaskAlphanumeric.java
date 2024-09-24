package ejercicios.ejercicioHilosAlfanumericos.domain;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TaskAlphanumeric implements Runnable{

    private Type type;
    private List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

    public TaskAlphanumeric(Type type){
        this.type = type;
    }

    @Override
    public void run() {
        if (type == Type.NUMERO){
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(500l);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }else {
            for (String letter: letters){
                System.out.println(Thread.currentThread().getName() + " " + letter);
                try {
                    TimeUnit.MILLISECONDS.sleep(500l);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

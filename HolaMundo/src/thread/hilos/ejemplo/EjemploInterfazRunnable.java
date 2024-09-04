package thread.hilos.ejemplo;

import thread.hilos.ejemplo.runnable.ViajeTarea;

public class EjemploInterfazRunnable {

    public static void main(String[] args) {
        
        new Thread(new ViajeTarea("cucuta")).start();
        new Thread(new ViajeTarea("cali")).start();
        new Thread(new ViajeTarea("bogota")).start();
        new Thread(new ViajeTarea("medellin")).start();

    }

}

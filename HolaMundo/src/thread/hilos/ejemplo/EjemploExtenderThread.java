package thread.hilos.ejemplo;

import thread.hilos.ejemplo.thread.NombreThread;

public class EjemploExtenderThread {

    public static void main(String[] args) throws InterruptedException {
        
        Thread hilo = new NombreThread("leonard");
        hilo.start();

        Thread hilo2 = new NombreThread("andrez");
        hilo2.start();

        Thread hilo3 = new NombreThread("guzman");
        hilo3.start();
        
        System.out.println(hilo.getState());

    }
}

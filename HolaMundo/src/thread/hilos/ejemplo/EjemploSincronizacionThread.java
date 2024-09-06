package thread.hilos.ejemplo;

import thread.hilos.ejemplo.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {

    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("hola", "mundo")).start();
        new Thread(new ImprimirFrases("como", "estas")).start();
        Thread.sleep(500);
        Thread th3 = new Thread(new ImprimirFrases("bien", "y tu"));
        th3.start();
        Thread.sleep(100);
        System.out.println(th3.getState());
    }

    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1 + " ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(frase2);
    }

}

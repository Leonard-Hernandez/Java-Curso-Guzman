package thread.hilos.ejemplo.runnable;


import static thread.hilos.ejemplo.EjemploSincronizacionThread.imprimirFrases;;

public class ImprimirFrases implements Runnable {

    private String frase1, frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        imprimirFrases(frase1, frase2);
    }

}

package thread.hilos.ejemplo.thread;

public class NombreThread extends Thread{

    public NombreThread(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        System.out.println("se inicia el metodo run del hilo " + this.getName());

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(i + " - " + this.getName());            
        }

        System.out.println("se termina el metodo run del hilo " + this.getName());
    }
    
}

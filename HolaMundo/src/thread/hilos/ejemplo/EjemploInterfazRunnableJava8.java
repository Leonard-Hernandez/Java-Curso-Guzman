package thread.hilos.ejemplo;

public class EjemploInterfazRunnableJava8 {

    public static void main(String[] args) {

        Runnable viaje = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long)(Math.random() * 1000));
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
        
                System.out.println("finalmente me voy de viaje " + Thread.currentThread().getName());
            };

        new Thread(viaje, "cucuta").start();
        new Thread(viaje, "cali").start();
        new Thread(viaje, "bogota").start();
        new Thread(viaje, "medellin").start();

    }

}

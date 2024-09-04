package thread.hilos.ejemplo;

public class EjemploInterfazRunnableJava8 {

    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();
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
                System.out.println(main.getState());
            };

        Thread v1 = new Thread(viaje, "cucuta");
        Thread v2 = new Thread(viaje, "cali");
        Thread v3 = new Thread(viaje, "bogota");
        Thread v4 = new Thread(viaje, "medellin");
        
        v1.start();
        v2.start();
        v3.start();
        v4.start();

        v1.join();
        v2.join();
        v3.join();
        v4.join();
        
        //Thread.sleep(1000);
        System.out.println("Continuando la ejecucion del metodo main: " + main.getName());
        System.out.println(main.getState());

    }

}

package thread.hilos.ejemplosync;

public class Panaderia {
    private String pan;
    private boolean disponible = false;

    public synchronized void hornear(String masa) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea: " + this.pan);
        this.disponible = true;
        notify();
    }

    public synchronized String consumir(){
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Cliente consume: " + this.pan);
        this.disponible = false;
        notify();
        return this.pan;

    }
}

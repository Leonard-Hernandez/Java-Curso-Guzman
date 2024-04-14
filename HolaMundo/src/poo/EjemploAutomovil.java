package poo;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Impresa", "Blanco" , 2.0);

        Automovil auto2 = new Automovil("Toyota", "Supra", "negro", 8.0, 50);
        Automovil auto3 = new Automovil("Toyota", "Supra", "negro", 8.0, 50);

        Automovil nissan = new Automovil();

        System.out.println("auto2 == auto3 =" + (auto2 == auto3));
        System.out.println("auto2.equals(auto3) =" + (auto2.equals(auto3)));

        System.out.println(auto.detalle());
        System.out.println(auto2.detalle());
        System.out.println(auto.acelerar(150));
        System.out.println(auto2.acelerar(200));
        System.out.println(auto.frenar());
        System.out.println(auto2.frenar());

        System.out.println(auto.acelerarFrenar(150));
        System.out.println(auto2.acelerarFrenar(200));

        System.out.println("Kilometro por litro " + auto2.calcularConsumo(300,0.6f));
        System.out.println("Kilometro por litro " + auto2.calcularConsumo(300,60));

    }
}

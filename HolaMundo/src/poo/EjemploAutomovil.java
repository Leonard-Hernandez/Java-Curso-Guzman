package poo;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.setFabricante("Subaru");
        auto.setModel("Impresa");
        auto.setCilindrada(2.0);
        auto.setColor("Blanco");

        Automovil auto2 = new Automovil();

        auto2.setFabricante("Toyota");
        auto2.setModel("Supra");
        auto2.setCilindrada(8.0);
        auto2.setColor("Negro");

        System.out.println(auto.detalle());
        System.out.println(auto2.detalle());
        System.out.println(auto.acelerar(150));
        System.out.println(auto2.acelerar(200));
        System.out.println(auto.frenar());
        System.out.println(auto2.frenar());

        System.out.println(auto.acelerarFrenar(150));
        System.out.println(auto2.acelerarFrenar(200));

        System.out.println("Kilometro por litro " + auto2.calcularConsumo(300,0.6f));
        System.out.println("Kilometro por litro " + auto2.calcularConsumo(300,6));

    }
}

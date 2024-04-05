package poo;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.fabricante = "Subaru";
        auto.model = "Impresa";
        auto.cilindrada = 2.0;
        auto.color = "Blanco";

        Automovil auto2 = new Automovil();

        auto2.fabricante = "Toyota";
        auto2.model = "Supra";
        auto2.cilindrada = 8.0;
        auto2.color = "Negro";

        System.out.println(auto.detalle());
        System.out.println(auto2.detalle());
        System.out.println(auto.acelerar(150));
        System.out.println(auto2.acelerar(200));
        System.out.println(auto.frenar());
        System.out.println(auto2.frenar());

        System.out.println(auto.acelerarFrenar(150));
        System.out.println(auto2.acelerarFrenar(200));

    }
}

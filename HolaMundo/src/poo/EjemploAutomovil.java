package poo;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.fabricante = "Subaru";
        auto.model = "Impresa";
        auto.cilindrada = 2.0;
        auto.color = "Blanco";

        System.out.println("auto = " + auto.fabricante);
        System.out.println("auto.model = " + auto.model);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " + auto.cilindrada);

        Automovil auto2 = new Automovil();

        auto2.fabricante = "Toyota";
        auto2.model = "Supra";
        auto2.cilindrada = 8.0;
        auto2.color = "Negro";

        System.out.println("auto = " + auto2.fabricante);
        System.out.println("auto.model = " + auto2.model);
        System.out.println("auto.color = " + auto2.color);
        System.out.println("auto.cilindrada = " + auto2.cilindrada);

    }
}

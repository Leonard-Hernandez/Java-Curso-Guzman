package poo;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Impresa", Color.ROJO);
        auto.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        auto.setEstanque(new Estanque());

        Automovil auto2 = new Automovil("Toyota", "Supra", Color.VERDE, new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        Automovil auto3 = new Automovil("Toyota", "Supra", Color.AMARILLO);
        auto3.setMotor(new Motor(3.0, TipoMotor.BENCINA));
        auto3.setEstanque(new Estanque(45));


        Automovil nissan = new Automovil();
        Date fecha = new Date();

        System.out.println("auto 3 == fecha" + auto3.equals(fecha));
        System.out.println(auto2.toString());
        System.out.println("nissan.equals(auto2) = " + nissan.equals(auto2));
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

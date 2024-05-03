package poo;

import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorSubaro = new Persona("Andrez", "Guzman");
        Automovil subaru = new Automovil("Subaru", "Impresa", Color.ROJO);
        subaru.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaro);
        
        Persona conductorSupra = new Persona("Leonard", "hernandez");
        Automovil supra = new Automovil("Toyota", "Supra", Color.VERDE,
                new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        supra.setConductor(conductorSupra);
        supra.setTipo(TipoAutomovil.CONVERTIBLE);

        Persona conductorSuzuki = new Persona("Lubraska", "Ferreira");
        Automovil suzuki = new Automovil("Toyota", "Supra", Color.AMARILLO);
        suzuki.setMotor(new Motor(3.0, TipoMotor.BENCINA));
        suzuki.setEstanque(new Estanque(45));
        suzuki.setTipo(TipoAutomovil.SUV);
        suzuki.setConductor(conductorSuzuki);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Javier", "Hernandez"));

        Automovil[] autos = new Automovil[4];
        autos[0] = subaru;
        autos[1] = supra;
        autos[2] = suzuki;
        autos[3] = audi;

        System.out.println("sin ordenar");
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }

        System.out.println("ordenado");
        Arrays.sort(autos);
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }

    }
}

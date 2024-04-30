package poo;

public class EjemploAutomovilRelacionesObjeto {
    public static void main(String[] args) {

        Rueda[] ruedasSub = new Rueda[5];
        ruedasSub[0] = new Rueda("Yokohama",16,7.5);
        ruedasSub[1] = new Rueda("Yokohama",16,7.5);
        ruedasSub[2] = new Rueda("Yokohama",16,7.5);
        ruedasSub[3] = new Rueda("Yokohama",16,7.5);
        ruedasSub[4] = new Rueda("Yokohama",16,7.5);

        Persona conductorSubaro = new Persona("Andrez", "Guzman");
        Automovil subaru = new Automovil("Subaru","Impresa", Color.ROJO);
        subaru.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaro);
        subaru.setRuedas(ruedasSub);

        Rueda[] ruedasSupra = {
            new Rueda("Michelin", 15,5),
            new Rueda("Michelin", 15,5),
            new Rueda("Michelin", 15,5),
            new Rueda("Michelin", 15,5),
            new Rueda("Michelin", 15,5)
        };

        Persona conductorSupra = new Persona("Leonard", "hernandez");
        Automovil supra = new Automovil("Toyota", "Supra", Color.VERDE, 
        new Motor(3.0, TipoMotor.DIESEL), new Estanque(45), conductorSupra, ruedasSupra);
        supra.setTipo(TipoAutomovil.CONVERTIBLE);

        Rueda[] ruedasSupra2 = {
            new Rueda("Pirelli", 20,2.5),
            new Rueda("Pirelli", 20,2.5),
            new Rueda("Pirelli", 20,2.5),
            new Rueda("Pirelli", 20,2.5)            
        };

        Persona conductorSupra2 = new Persona("Lubraska", "Ferreira");
        Automovil supra2 = new Automovil("Toyota", "Supra", Color.AMARILLO);
        supra2.setMotor(new Motor(3.0, TipoMotor.BENCINA));
        supra2.setEstanque(new Estanque(45));
        supra2.setTipo(TipoAutomovil.CONVERTIBLE);
        supra2.setConductor(conductorSupra2);
        supra2.setRuedas(ruedasSupra2);

        System.out.println(subaru.detalle());
        System.out.println(supra.detalle());
        System.out.println(supra2.detalle());

        System.out.println("conductor supra2" + supra2.getConductor());
        System.out.println("Ruedas supra 2");
        for (Rueda rueda : ruedasSupra2) {
            System.out.println(rueda.getFabricante() + " aro " + rueda.getAro() + " ancho " + rueda.getAncho());
        }

    }
}

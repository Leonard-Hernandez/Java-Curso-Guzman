package poo;

public class EjemploAutomovilRelacionesObjeto {
    public static void main(String[] args) {

        Persona conductorSubaro = new Persona("Andrez", "Guzman");
        Automovil subaru = new Automovil("Subaru", "Impresa", Color.ROJO);
        subaru.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaro);
        // subaru.setRuedas(ruedasSub);

        Rueda[] ruedasSub = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona conductorSupra = new Persona("Leonard", "hernandez");
        Automovil supra = new Automovil("Toyota", "Supra", Color.VERDE,
                new Motor(3.0, TipoMotor.DIESEL), new Estanque(45));
        supra.setConductor(conductorSupra);
        supra.setTipo(TipoAutomovil.CONVERTIBLE);

        Rueda[] ruedasSupra = new Rueda[5];
        for (int i = 0; i < ruedasSupra.length; i++) {
            supra.addRueda(new Rueda("Michelin", 15, 5));
        }

        Persona conductorSupra2 = new Persona("Lubraska", "Ferreira");
        Automovil supra2 = new Automovil("Toyota", "Supra", Color.AMARILLO);
        supra2.setMotor(new Motor(3.0, TipoMotor.BENCINA));
        supra2.setEstanque(new Estanque(45));
        supra2.setTipo(TipoAutomovil.CONVERTIBLE);
        supra2.setConductor(conductorSupra2);

        supra2.addRueda(new Rueda("Pirelli", 20, 2.5))
                .addRueda(new Rueda("Pirelli", 20, 2.5))
                .addRueda(new Rueda("Pirelli", 20, 2.5))
                .addRueda(new Rueda("Pirelli", 20, 2.5))
                .addRueda(new Rueda("Pirelli", 20, 2.5));

        System.out.println(subaru.detalle());
        System.out.println(supra.detalle());
        System.out.println(supra2.detalle());

        System.out.println("conductor supra2 " + supra2.getConductor());
        System.out.println("Ruedas supra 2");
        for (Rueda rueda : supra2.getRuedas()) {
            System.out.println(rueda.getFabricante() + " aro " + rueda.getAro() + " ancho " + rueda.getAncho());
        }

    }
}

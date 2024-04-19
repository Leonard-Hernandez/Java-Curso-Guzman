package poo;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impresa", Color.ROJO , 2.0);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        Automovil supra = new Automovil("Toyota", "Supra", Color.VERDE, 8.0, 50);
        supra.setTipo(TipoAutomovil.CONVERTIBLE);
        Automovil supra2 = new Automovil("Toyota", "Supra", Color.AMARILLO, 8.0, 50);
        supra2.setTipo(TipoAutomovil.CONVERTIBLE);

        System.out.println("Auto velidad maxima ciudad " + Automovil.VELOCIDAD_MAX_CIUDAD);
        System.out.println("Auto velidad maxima carretera " + Automovil.VELOCIDAD_MAX_CARRETERA);

        Automovil.setColorPatente(Color.AZUL.getColor());
        System.out.println(subaru.detalle());
        System.out.println(supra.detalle());
        System.out.println(supra2.detalle());

    }
}

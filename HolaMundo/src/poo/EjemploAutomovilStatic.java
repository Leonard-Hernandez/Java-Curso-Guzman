package poo;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru","Impresa", "Blanco" , 2.0);
        Automovil supra = new Automovil("Toyota", "Supra", "negro", 8.0, 50);
        Automovil supra2 = new Automovil("Toyota", "Supra", "negro", 8.0, 50);

        System.out.println("Auto velidad maxima ciudad " + Automovil.VELOCIDAD_MAX_CIUDAD);
        System.out.println("Auto velidad maxima carretera " + Automovil.VELOCIDAD_MAX_CARRETERA);

        Automovil.setColorPatente("Azul");
        System.out.println(subaru.detalle());
        System.out.println(supra.detalle());
        System.out.println(supra2.detalle());

    }
}

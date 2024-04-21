package poo;

public class EjemploAutomovilEnum {
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

        TipoAutomovil tipoSubaru = subaru.getTipo();

        switch (tipoSubaru) {

            case HATCHBACK ->
                System.out.println("Es un auntomovil mediano compacto, aspecto deportivo");
            case CONVERTIBLE ->
                System.out.println("El automovil es un deportivo y descapotable de dos puertas");
            case COUPE ->
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON->
                System.out.println("Es un automovil utilitario de transporte, de empresas");
            case PICKUP->
                System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                System.out.println("Es un automovil mas grande, con maleta mas grande");

        }

    }
}

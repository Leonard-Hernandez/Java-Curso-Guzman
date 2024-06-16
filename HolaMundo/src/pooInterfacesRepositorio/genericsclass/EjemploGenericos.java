package pooInterfacesRepositorio.genericsclass;

public class EjemploGenericos {

    public static void main(String[] args) {
        
        Camion transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal("Pedro", "Caballo"));
        transporteCaballos.add(new Animal("Luis", "Caballo"));
        transporteCaballos.add(new Animal("Pepe", "Caballo"));
        transporteCaballos.add(new Animal("Pepa", "Caballo"));
        transporteCaballos.add(new Animal("Pepito", "Caballo"));

        for(Object o: transporteCaballos){
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " - " + a.getTipo());
        }

        Camion transMaquinas = new Camion(3);
        transMaquinas.add(new Maquinaria("Tractor"));
        transMaquinas.add(new Maquinaria("Servidor"));
        transMaquinas.add(new Maquinaria("Segador"));

        for(Object o: transMaquinas){
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

        Camion transAuto = new Camion(3);
        transAuto.add(new Automovil("Ford"));
        transAuto.add(new Automovil("Fiat"));
        transAuto.add(new Automovil("Chevrolet"));

        for(Object o: transAuto){
            Automovil a = (Automovil) o;
            System.out.println(a.getMarca());
        }

    }

}

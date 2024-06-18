package pooInterfacesRepositorio.genericsclass;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camion){

        for(T t: camion){
            if (t instanceof Animal){ 
                Animal a = (Animal) t;
                System.out.println(a.getNombre() + " - " + a.getTipo());                
            }else if(t instanceof Maquinaria){
                Maquinaria m = (Maquinaria) t;
                System.out.println(m.getTipo());
            }else if(t instanceof Automovil){
                Automovil a = (Automovil) t;
                System.out.println(a.getMarca());
            }

        }

    }

    public static void main(String[] args) {
        
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Pedro", "Caballo"));
        transporteCaballos.add(new Animal("Luis", "Caballo"));
        transporteCaballos.add(new Animal("Pepe", "Caballo"));
        transporteCaballos.add(new Animal("Pepa", "Caballo"));
        transporteCaballos.add(new Animal("Pepito", "Caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Tractor"));
        transMaquinas.add(new Maquinaria("Servidor"));
        transMaquinas.add(new Maquinaria("Segador"));

        imprimirCamion(transMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Ford"));
        transAuto.add(new Automovil("Fiat"));
        transAuto.add(new Automovil("Chevrolet"));

        imprimirCamion(transAuto);

    }

}

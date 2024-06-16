package pooInterfacesRepositorio.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable{

    private List objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList();
    }

    public void add(Object o) {
        if (objetos.size() < max) {
            objetos.add(o);
        }else{
            throw new RuntimeException("Camion lleno");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }

}

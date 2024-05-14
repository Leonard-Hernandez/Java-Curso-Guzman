package pooPaquetes.org.leonard.app.Jardin;

import pooPaquetes.org.leonard.app.hogar.*;

public class EjemploPaquetes {
    
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("leonard");      
        System.out.println(p.getNombre());
        
        Perro pe = new Perro();
        pe.nombre = "Toby";
        pe.raza = "pastor aleman";

        String jugando = pe.jugar(p);

        System.out.println(jugando);


    }

   

}

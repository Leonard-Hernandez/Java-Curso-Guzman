package pooPaquetes.org.leonard.app.Jardin;

import pooPaquetes.org.leonard.app.hogar.*;
import static pooPaquetes.org.leonard.app.hogar.Persona.*;
import static pooPaquetes.org.leonard.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("leonard");
        p.setApellido("Hernandez");
        p.setColorPelo(CAFE);      
        System.out.println(p.getNombre());
        
        Perro pe = new Perro();
        pe.nombre = "Toby";
        pe.raza = "pastor aleman";

        String jugando = pe.jugar(p);

        System.out.println(jugando);

        String saludo = saludar();
        System.out.println(saludo);

        String generoMujer = GENERO_FEMENINO;
        System.out.println(generoMujer);

        String generoHombre = GENERO_MASCULINO;
        System.out.println(generoHombre);


    }

   

}

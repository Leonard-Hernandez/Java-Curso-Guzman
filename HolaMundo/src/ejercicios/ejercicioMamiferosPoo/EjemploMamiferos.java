package ejercicios.ejercicioMamiferosPoo;

import java.util.Arrays;
import java.util.List;

import ejercicios.ejercicioMamiferosPoo.tiposManiferos.Mamifero;

public class EjemploMamiferos {

    public static void main(String[] args) {
        
        Perro perro = new Perro();
        perro.setAltura(1.5f);
        perro.setNombreCientifico("Canis lupus");
        perro.setHabitat("Pradera");
        perro.setPeso(5.0f);
        perro.setLargo(2.0f);
        perro.setFuerzaMordida(5);
        perro.setTamanoColmillos(20f);

        Tigre tigre = new Tigre();
        tigre.setAltura(1.5f);
        tigre.setNombreCientifico("Panthera tigris");
        tigre.setHabitat("Selva");
        tigre.setPeso(5.0f);
        tigre.setLargo(2.0f);
        tigre.setEspecieTigre("Panthera tigris");
        tigre.setTamanoGarras(2.0f);
        tigre.setVelocidad(5);

        Guepardo guepardo = new Guepardo( "Selva", 1.5f, 2.0f, 5.0f, "Gallus domesticus", 2.0f, 5);

        Lobo lobo = new Lobo("Sucre",1.7f, 2.2f, 50f, "Canis lupus", "cafe", 2f);

        Leon leon = new Leon("Selva", 1.5f, 2.0f, 5.0f, "Panthera leo", 2.0f, 5, 20, 25f);

        List<Mamifero> mamiferos = Arrays.asList(perro, tigre, guepardo, lobo, leon);

        for (Mamifero mamifero : mamiferos) {
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
            System.out.println();
        }

    }

}

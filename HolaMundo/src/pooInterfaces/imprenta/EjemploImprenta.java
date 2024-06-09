package pooInterfaces.imprenta;

import pooInterfaces.imprenta.modelo.*;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculo cv = new Curriculo("leonard", "Tecnico en sistemas", "Apasionado por la tecnologia");
        cv.addExperiencia("Java");
        cv.addExperiencia("Spring framwork");
        cv.addExperiencia("Mysql");
        cv.addExperiencia("Git");

        Libro libro = new Libro("George Orwell", "1984", Genero.DRAMA);
        libro.addpagina(new Pagina("Winstong no amaba al partido...."))
                .addpagina(new Pagina("Lo obligaron a hacerlo"))
                .addpagina(new Pagina("Recomiendo leer rebelion en la granja"));

        Informe informe = new Informe("Leonard", "Lubraska",
                "Implementacion de windows server para despliegue de imagenes");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}

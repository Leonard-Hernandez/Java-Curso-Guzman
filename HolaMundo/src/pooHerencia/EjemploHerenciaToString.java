package pooHerencia;

public class EjemploHerenciaToString {

    public static void main(String[] args) {

        System.out.println("========= creando la instancia de la clase Alumno =========");
        Alumno alumno = new Alumno("Leonard", "Hernandez", 10, "UTN");
        alumno.setNotaMatematicas(10);
        alumno.setNotaLenguaje(9);
        alumno.setNotaHistoria(8);
        alumno.setEmail("9vIzK@example.com");

        System.out.println("========= creando la instancia de la clase AlumnoInternacional =========");

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("lubraska", "Ferreira", "Australia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("UTN");
        alumnoInternacional.setNotaIdiomas(2.5);
        alumnoInternacional.setNotaMatematicas(10);
        alumnoInternacional.setNotaLenguaje(9);
        alumnoInternacional.setNotaHistoria(8);
        alumnoInternacional.setEmail("9vIzK@example.com");

        System.out.println("========= creando la instancia de la clase Profesor =========");

        Profesor profesor = new Profesor("Carlos", "Martinez", "Programacion");
        profesor.setEdad(41);
        profesor.setEmail("9vIzK@example.com");

        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {

        System.out.println(persona.toString());
        System.out.println();

    }
}

package pooHerencia;

public class EjemploHerenciaConstructores {

    public static void main(String[] args) {

        System.out.println("========= creando la instancia de la clase Alumno =========");
        Alumno alumno = new Alumno("Leonard", "Hernandez", 10, "UTN");
        alumno.setNotaMatematicas(10);
        alumno.setNotaLenguaje(9);
        alumno.setNotaHistoria(8);

        System.out.println("========= creando la instancia de la clase AlumnoInternacional =========");

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("lubraska", "Ferreira", "Australia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("UTN");
        alumnoInternacional.setNotaIdiomas(2.5);
        alumnoInternacional.setNotaMatematicas(10);
        alumnoInternacional.setNotaLenguaje(9);
        alumnoInternacional.setNotaHistoria(8);

        System.out.println("========= creando la instancia de la clase Profesor =========");

        Profesor profesor = new Profesor("Carlos", "Martinez", "Programacion");
        profesor.setEdad(41);

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println(profesor.getNombre() + " " + profesor.getApellido() + " " + profesor.getAsignatura());

        Class claseAlumnoInt = alumnoInternacional.getClass();
        while (claseAlumnoInt.getSuperclass() != null) {

            String hija = claseAlumnoInt.getName();
            String padre = claseAlumnoInt.getSuperclass().getName();

            System.out.println("hija = " + hija);
            System.out.println("padre = " + padre);

            claseAlumnoInt = claseAlumnoInt.getSuperclass();

        }
    }

    public static void imprimir(Persona persona) {

        System.out.println("Nombre = " + persona.getNombre()
                + " " + persona.getApellido()
                + " " + persona.getEdad());

    }

}

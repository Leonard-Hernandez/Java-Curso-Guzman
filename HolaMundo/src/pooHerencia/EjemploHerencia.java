package pooHerencia;

public class EjemploHerencia {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Leonard");
        alumno.setApellido("Hernandez");

        Profesor profesor = new Profesor();
        profesor.setNombre("Carlos");
        profesor.setApellido("Martinez");
        profesor.setAsignatura("Programacion");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println(profesor.getNombre() + " " + profesor.getApellido() + " " + profesor.getAsignatura());
    }

}

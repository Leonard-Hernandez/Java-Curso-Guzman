package ejercicios.ejercicioPersonaGerentePoo;

public class EjemploGerente {

    public static void main(String[] args) {
        
        Persona persona = new Persona("Andres","Guzman","12345678","Calle 1");
        Empleado empleado = new Empleado("Andres","Guzman","12345678","Calle 1", 1, 1000.0);
        empleado.aumentarRemuneracion(20D);
        Gerente gerente = new Gerente("Andres","Guzman","12345678","Calle 1", 1, 1000.0, 10.0);
        Cliente cliente = new Cliente("Andres","Guzman","12345678","Calle 1", 1);

        System.out.println(persona+"\n");
        System.out.println(empleado +"\n");
        System.out.println(gerente +"\n");
        System.out.println(cliente +"\n"); 

    }

}

package ValorVsReferencia;
class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Leonard");

        System.out.println("inicioamos el main");
        System.out.println("persona ="+ persona.leerNombre());
        System.out.println("Antes de invocar el metodo test");

        test(persona);

        System.out.println("Despues de llamar el metodo test");
        System.out.println("persona ="+ persona.leerNombre());
        System.out.println("finaliza con main datos persona modificados");

    }

    public static void test(Persona persona){
        System.out.println("iniciamos el metodo test");
        persona.modificarNombre("pepe");
        System.out.println("finaliza con test");
    }
}

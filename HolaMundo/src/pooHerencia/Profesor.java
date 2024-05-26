package pooHerencia;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public Profesor(){
        System.out.println("Profesor: Inicializando constructor");
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos dias soy el profesor de la asignatura: " + this.getAsignatura();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "asignatura=" + asignatura; 
    }

    

}

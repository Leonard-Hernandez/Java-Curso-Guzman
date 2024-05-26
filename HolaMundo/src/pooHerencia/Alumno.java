package pooHerencia;

public class Alumno extends Persona {

    private String institucion;
    private double notaMatematicas;
    private double notaLenguaje;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: Inicializando constructor");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematicas, double notaLenguaje, double notaHistoria){
        super(nombre, apellido, edad);
        this.institucion = institucion;
        this.notaMatematicas = notaMatematicas;
        this.notaLenguaje = notaLenguaje;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){

        return "Hola, que tal, mi nombre es " + this.getNombre() + " " + this.getApellido();

    }

    public double calcularPromedio(){
        return (this.getNotaMatematicas() + this.getNotaLenguaje() + this.getNotaHistoria()) / 3;
    }

}

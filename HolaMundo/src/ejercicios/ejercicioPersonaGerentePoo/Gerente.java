package ejercicios.ejercicioPersonaGerentePoo;

public class Gerente extends Empleado {

    private Double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, int id, Double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion, id, remuneracion);
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, int id, Double remuneracion, Double presupuesto) {
        this(nombre, apellido, numeroFiscal, direccion, id, remuneracion);
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Presupuesto: " + this.presupuesto;
    }

    

}

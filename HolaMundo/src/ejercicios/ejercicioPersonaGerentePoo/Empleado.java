package ejercicios.ejercicioPersonaGerentePoo;

public class Empleado extends Persona {	

    private int empleadoId;
    private Double remuneracion;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, int id, Double remuneracion) {
        this(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = id;
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void aumentarRemuneracion(Double porcentaje) {
        this.remuneracion += this.remuneracion * porcentaje / 100;
    }

    @Override
    public String toString() {
        return super.toString() + "id: " + this.empleadoId + "\n"
                + "Remuneracion: " + this.remuneracion;
    }


}

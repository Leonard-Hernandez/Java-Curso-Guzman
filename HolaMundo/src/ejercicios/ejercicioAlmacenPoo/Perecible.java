package ejercicios.ejercicioAlmacenPoo;

import java.time.LocalDate;

public class Perecible extends Producto{

    private LocalDate fechaVencimiento;

    public Perecible(String nombre, Double precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Fecha de vencimiento: " + this.getFechaVencimiento();
    }    

}

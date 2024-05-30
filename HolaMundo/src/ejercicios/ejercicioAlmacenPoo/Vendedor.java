package ejercicios.ejercicioAlmacenPoo;

public class Vendedor extends Persona {

    private double sueldo;
    private double numeroCompras;

    public Vendedor(String nombre, String apellidos, String email, double sueldo, double numeroCompras) {
        super(nombre, apellidos, email);
        this.sueldo = sueldo;
        this.numeroCompras = numeroCompras;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getNumeroCompras() {
        return numeroCompras;
    }
    
    public void hacerVenta (Cliente cliente, Producto producto) {
        this.numeroCompras++;
        System.out.println("el vendedor " + this.getNombre() + " ha vendido el producto " + cliente.getNombre() + " por " + this.sueldo);
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Sueldo: " + this.getSueldo() + "\n"
                + "Numero de compras: " + this.getNumeroCompras();
    }

}

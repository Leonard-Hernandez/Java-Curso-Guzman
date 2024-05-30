package ejercicios.ejercicioAlmacenPoo;

public class Cliente extends Persona {

    private int numeroCompras;
    private double descuento;

    public Cliente(String nombre, String apellidos, String email, int numeroCompras, double descuento) {
        super(nombre, apellidos, email);
        this.numeroCompras = numeroCompras;
        this.descuento = descuento;
    }

    public int getNumeroCompras() {
        return numeroCompras;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String hacerCompras(Producto producto, Vendedor vendedor) {
        vendedor.hacerVenta(this, producto);
        this.numeroCompras++;
        return "el cliente " + this.getNombre() + " ha comprado " + producto.getNombre() + " por "
                + vendedor.getNombre();

    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Numero de compras: " + this.getNumeroCompras() + "\n"
                + "Descuento: " + this.getDescuento();
    }

}

package ejercicios.ejercicioCatalogoPoo.modelo;

public class TvLcd extends Electronico {

    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public Double getPrecioVenta() {
        return this.precio * 1.5;
    }

}

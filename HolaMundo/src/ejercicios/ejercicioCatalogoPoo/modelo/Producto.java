package ejercicios.ejercicioCatalogoPoo.modelo;

abstract public class Producto implements IProducto {

    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }   

    @Override
    public Integer getPrecio(){
        return this.precio;
    }


}

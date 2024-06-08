package ejercicios.ejercicioMamiferosPoo.tiposManiferos;

abstract public class Felino extends Mamifero {

    protected Float tamanoGarras;
    protected int velocidad;


    public Felino() {}

    public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(Float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    

}

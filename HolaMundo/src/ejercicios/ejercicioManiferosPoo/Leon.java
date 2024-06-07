package ejercicios.ejercicioManiferosPoo;

import ejercicios.ejercicioManiferosPoo.tiposManiferos.Felino;

public class Leon extends Felino{

    private Integer numManada;
    private Float potenciaRugido;

    public Leon() {
        super();
    }
    public Leon(String habitat, Float altura, Float largo, Float peso, Float nombreCientifico, Float tamanoGarras, int velocidad, Integer numManada, Float potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugido = potenciaRugido;
    }    

    public Integer getNumManada() {
        return numManada;
    }
    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }
    public Float getPotenciaRugido() {
        return potenciaRugido;
    }
    public void setPotenciaRugido(Float potenciaRugido) {
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "El Leon de especie, ruge con una potencia de " + getPotenciaRugido() + " en su habitat " + getHabitat() + " come con sus garras de " + getTamanoGarras() + " y come a su presa";
    }

    @Override
    public String dormir() {
        return "El leon duerme con su manada de " + getNumManada() + " en su habitat " + getHabitat();
    }

    @Override
    public String correr() {
        return "El leon correr por su habitat " + getHabitat();
    }

    @Override
    public String comunicarse() {
        return "El leon se comunica con su mandada de " + getNumManada() + " en su habitat " + getHabitat();
    }

    

}

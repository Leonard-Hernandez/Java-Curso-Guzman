package ejercicios.ejercicioMamiferosPoo;

import ejercicios.ejercicioMamiferosPoo.tiposManiferos.Canino;

public class Lobo extends Canino{

    private String color;
    private Float tamanoColmillos;

    public Lobo() {}

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(Float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }

    @Override
    public String comer() {
        return "El lobo de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " come ratones con sus colmillos de " + getTamanoColmillos() + " y come a su presa";
    }

    @Override
    public String dormir() {
        return "El lobo de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " duerme";
    }

    @Override
    public String correr() {
        return "El lobo de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " corre";
    }

    @Override
    public String comunicarse() {
        return "El lobo de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " comunica";
    }

}

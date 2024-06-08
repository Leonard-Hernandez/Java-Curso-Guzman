package ejercicios.ejercicioMamiferosPoo;

import ejercicios.ejercicioMamiferosPoo.tiposManiferos.Felino;

public class Guepardo extends Felino{

    public Guepardo() {}

    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " come ratones con sus garras de " + getTamanoGarras();
    }

    @Override
    public String dormir() {
        return "El guepardo de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " duerme";
    }

    @Override
    public String correr() {
        return "El guepardo de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " corre";
    }

    @Override
    public String comunicarse() {
        return "El guepardo de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " comunica";
    }

}

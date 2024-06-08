package ejercicios.ejercicioManiferosPoo;

import ejercicios.ejercicioManiferosPoo.tiposManiferos.Canino;

public class Perro extends Canino{

    private Integer fuerzaMordida;

    public Perro() {}

    public Perro(String habitat, Float altura, Float largo, Float peso, Float nombreCientifico, String color, Float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return this.fuerzaMordida;
    }

    public void setFuerzaMordida(Integer fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " come ratones con sus colmillos de " + getTamanoColmillos() + " y come a su presa";
    }

    @Override
    public String dormir() {
        return "El perro de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " duerme";
    }

    @Override
    public String correr() {
        return "El perro de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " corre";
    }

    @Override
    public String comunicarse() {
        return "El perro de especie " + getNombreCientifico() + " en su habitat " + getHabitat() + " comunica";
    }

}

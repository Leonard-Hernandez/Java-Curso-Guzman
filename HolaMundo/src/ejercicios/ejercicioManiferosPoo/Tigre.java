package ejercicios.ejercicioManiferosPoo;

import ejercicios.ejercicioManiferosPoo.tiposManiferos.Felino;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre() {}

    public Tigre(String habitat, Float altura, Float largo, Float peso, Float nombreCientifico, Float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre; 
    } 

    
    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre de especie " + getEspecieTigre() + " en su habitat " + getHabitat() + " come ratones con sus garras de " + getTamanoGarras();
    }

    @Override
    public String dormir() {
        return "El tigre de especie " + getEspecieTigre() + " en su habitat " + getHabitat() + " duerme";
    }

    @Override
    public String correr() {
        return "El tigre de especie " + getEspecieTigre() + " en su habitat " + getHabitat() + " corre";
    }

    @Override
    public String comunicarse() {
        return "El tigre de especie " + getEspecieTigre() + " en su habitat " + getHabitat() + " comunica";
    }


}

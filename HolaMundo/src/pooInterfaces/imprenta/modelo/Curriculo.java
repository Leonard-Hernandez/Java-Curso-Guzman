package pooInterfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {

    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperiencia(String ex) {
        this.experiencias.add(ex);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profecion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");

        for (String ex : this.experiencias) {
            sb.append("- ").append(ex).append("\n");
        }

        return sb.toString();
    }

}

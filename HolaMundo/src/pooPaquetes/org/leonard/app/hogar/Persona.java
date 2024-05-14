package pooPaquetes.org.leonard.app.hogar;

public class Persona {
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellidoS(String apellidoS) {
        this.apellido = apellidoS;
    }

    public String lanzarPelota() {
        return "haz lanzado una pelota";
    }

    

}

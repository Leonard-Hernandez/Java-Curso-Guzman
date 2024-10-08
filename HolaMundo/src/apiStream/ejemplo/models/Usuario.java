package apiStream.ejemplo.models;

public class Usuario {

    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;

    public Usuario() {
        this.id = ++ultimoId;
    }

    public Usuario(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

}

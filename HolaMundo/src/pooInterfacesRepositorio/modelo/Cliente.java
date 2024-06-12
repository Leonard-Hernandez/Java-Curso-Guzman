package pooInterfacesRepositorio.modelo;

public class Cliente {

    private Integer id;
    private String nombre;
    private String apellidos;
    private static int ultimoId;

    public Cliente() {
        this.id = ++ultimoId;
    }

    public Cliente(Integer id, String nombre, String apellidos) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Nombre: " + nombre + ", Apellidos: " + apellidos;
    }

    

}

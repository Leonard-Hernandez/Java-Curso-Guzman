package ejercicios.ejercicioPersonaGerentePoo;

public class Cliente extends Persona {

    private int clienteID;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int id) {
        this(nombre, apellido, numeroFiscal, direccion);
        this.clienteID = id;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Id: " + this.clienteID;
    }

}

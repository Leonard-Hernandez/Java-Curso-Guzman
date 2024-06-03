package pooClasesAbstractas.form.validador;

public class NoNuloValidador extends Validador{

    protected String mensaje = "No puede ser nulo";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public boolean esValiddo(String valor) {
        return (valor != null);
    }

}

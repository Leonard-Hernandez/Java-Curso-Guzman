package pooClasesAbstractas.form.validador;

public class EmailValidador extends Validador {

    protected String mensaje = "el campo %s no es un email";
    private final static String EMAIL_REGEX= "^(.+)@(.+)$";

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

        return (valor.matches(EMAIL_REGEX));
        
    }

}

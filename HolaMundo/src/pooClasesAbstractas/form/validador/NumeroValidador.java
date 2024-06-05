package pooClasesAbstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "El campo %s debe ser un numero";

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
        try{
            Double.parseDouble(valor);
            return true;
        }catch(Exception e){
            return false;
        }
    }   

}

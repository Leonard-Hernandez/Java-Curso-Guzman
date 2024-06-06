package pooClasesAbstractas.form.validador;

import pooClasesAbstractas.form.validador.mensaje.MensajeFormateable;

public class LargoValidadros extends Validador implements MensajeFormateable {

    protected String mensaje = "El campo %s debe tener minimo %d caracteres y maximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidadros() {}

    public LargoValidadros(int min, int max) {
        this.min = min;
        this.max = max;
    }    

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        //this.mensaje = String.format(this.mensaje, this.min, this.max);

        if (valor == null) {
            return false;            
        }

        return (valor.length() >= this.min && valor.length() <= this.max);

    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, this.min, this.max);
    }

}

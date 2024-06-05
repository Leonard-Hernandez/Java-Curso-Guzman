package pooClasesAbstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import pooClasesAbstractas.form.validador.Validador;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<Validador>();
        this.errores = new ArrayList<String>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return this.errores;
    }

    public boolean esValido() {

        for (Validador validador : this.validadores) {
            if (!validador.esValiddo(this.valor)) {
                this.errores.add(String.format(validador.getMensaje(), this.nombre));
            }
        }

        return (this.errores.isEmpty());
    }

    abstract public String dibujarHtml();

}

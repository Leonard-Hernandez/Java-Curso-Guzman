package pooClasesAbstractas.form;

import java.util.Arrays;
import java.util.List;

import pooClasesAbstractas.form.elementos.*;
import pooClasesAbstractas.form.elementos.select.Opcion;
import pooClasesAbstractas.form.validador.EmailValidador;
import pooClasesAbstractas.form.validador.LargoValidadros;
import pooClasesAbstractas.form.validador.NoNuloValidador;
import pooClasesAbstractas.form.validador.NumeroValidador;
import pooClasesAbstractas.form.validador.RequeridoValidador;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidadros(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        lenguaje.addOpcion(new Opcion("1", "java").setSelected())
                .addOpcion(new Opcion("2", "c#"))
                .addOpcion(new Opcion("3", "python"))
                .addOpcion(new Opcion("4", "php"))
                .addOpcion(new Opcion("5", "javascript"));

        ElementoForm saludar = new ElementoForm("Soludar") {

            @Override
            public String dibujarHtml() {
                return "<input disabled name=\'" + this.nombre + "\' type=\'" + this.valor + "\'/>";
            }

        };

        saludar.setValor("Hola, este campo esta desabilitado");
        username.setValor("john.doe");
        password.setValor("1234");
        email.setValor("qQp5Mexample.com");
        edad.setValor("25");
        experiencia.setValor("... Mas de 10 años ...");

        List<ElementoForm> elementos = Arrays.asList(username, password, email, edad, experiencia, lenguaje, saludar);

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
        });

        elementos.forEach(e -> {
            if (!e.esValido()) {
                e.getErrores().forEach(System.out::println);
        }
        });

    }

}

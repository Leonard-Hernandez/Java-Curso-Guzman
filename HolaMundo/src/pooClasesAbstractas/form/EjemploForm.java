package pooClasesAbstractas.form;

import java.util.Arrays;
import java.util.List;

import pooClasesAbstractas.form.elementos.*;
import pooClasesAbstractas.form.elementos.select.Opcion;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");

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
        email.setValor("qQp5M@example.com");
        edad.setValor("25");
        experiencia.setValor("... Mas de 10 años ...");

        List<ElementoForm> elementos = Arrays.asList(username, password, email, edad, experiencia, lenguaje, saludar);

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
        });

    }

}

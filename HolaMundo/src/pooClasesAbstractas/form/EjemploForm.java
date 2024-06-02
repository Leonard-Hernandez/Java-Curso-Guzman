package pooClasesAbstractas.form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pooClasesAbstractas.form.elementos.ElementoForm;
import pooClasesAbstractas.form.elementos.InputForm;
import pooClasesAbstractas.form.elementos.SelectForm;
import pooClasesAbstractas.form.elementos.TextareaForm;
import pooClasesAbstractas.form.elementos.select.Opcion;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");

        Opcion java = new Opcion("1", "java");

        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "c#"))
        .addOpcion(new Opcion("3", "python"))
        .addOpcion(new Opcion("4", "php"))
        .addOpcion(new Opcion("5", "javascript"));

        username.setValor("john.doe");
        password.setValor("1234");
        email.setValor("qQp5M@example.com");
        edad.setValor("25");
        java.setSelected(true);
        experiencia.setValor("... Mas de 10 años ...");

        List<ElementoForm> elementos = Arrays.asList(username, password, email, edad, experiencia, lenguaje);

        elementos.forEach(e ->{
            System.out.println(e.dibujarHtml());
        });

    }

}

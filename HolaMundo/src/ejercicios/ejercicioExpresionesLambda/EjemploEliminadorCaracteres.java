package ejercicios.ejercicioExpresionesLambda;

import java.util.Arrays;
import java.util.List;

public class EjemploEliminadorCaracteres {
    public static void main(String[] args) {

        EliminadorCaracteres eliminarCaracteres = (a ,b) ->{
            for (String caracter: b){
                a = a.replace(caracter,"");
            }
            return a.toUpperCase();
        };

        String ejemplo = "Hola, como estas, espero que te encuentes muy bien: te vengo a dar un saludo,,,";
        List<String> caracteres = Arrays.asList(",", " ", ":");

        EliminadorCaracteresImpl eliminadorCaracteresImpl = new EliminadorCaracteresImpl();

        System.out.println(eliminadorCaracteresImpl.eliminarEspacios(ejemplo,caracteres, eliminarCaracteres));

    }
}

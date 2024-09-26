package ejercicios.ejercicioExpresionesLambda.ocurrencia;

import java.util.HashMap;
import java.util.Map;

public class EjemploContarOcurrencias {

    public static void main(String[] args) {

        Map<String, Integer> mapaOcurrencias = new HashMap<>();
        StringBuilder sb = new StringBuilder("");
        OcurrenciaStringImpl ocurrenciaString = new OcurrenciaStringImpl();
        String texto = "Hola como estas, Hola, como estas, como como como, estas, estas";

        OcurrenciaString lambda = (a,b) ->{

            for(String palabra: a.split("([,.\\s]+)")){
                int oldcount = b.getOrDefault(palabra, 0);
                b.put(palabra, oldcount+1);
            }

            b.forEach((k,v) -> sb.append(k + " " + v+ "\n"));

            return sb.toString();

        };

        System.out.println((ocurrenciaString.contarOcurrencias(texto, mapaOcurrencias, lambda)));

    }

}

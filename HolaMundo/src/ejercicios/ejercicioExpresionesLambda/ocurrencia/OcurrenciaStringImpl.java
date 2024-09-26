package ejercicios.ejercicioExpresionesLambda.ocurrencia;

import java.util.Map;

public class OcurrenciaStringImpl {

    public String contarOcurrencias(String texto, Map<String, Integer> mapaOcurrencia, OcurrenciaString lambda){
        return lambda.contarOcurrencias(texto, mapaOcurrencia);
    }

}

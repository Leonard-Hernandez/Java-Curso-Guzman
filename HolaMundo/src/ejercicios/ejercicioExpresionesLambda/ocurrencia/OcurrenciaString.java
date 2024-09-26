package ejercicios.ejercicioExpresionesLambda.ocurrencia;

import java.util.Map;

@FunctionalInterface
public interface OcurrenciaString {

    String contarOcurrencias(String text, Map<String,Integer> mapaOcurrencias);

}

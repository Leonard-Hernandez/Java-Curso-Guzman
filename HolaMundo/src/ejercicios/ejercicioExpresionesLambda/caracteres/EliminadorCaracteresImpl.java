package ejercicios.ejercicioExpresionesLambda.caracteres;

import java.util.List;

public class EliminadorCaracteresImpl {

    public String eliminarEspacios(String a, List<String> b, EliminadorCaracteres lambda){
        return lambda.eliminarEspacios(a, b);
    };

}

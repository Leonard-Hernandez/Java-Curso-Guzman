package pooExcepciones.ejemplo;

public class Calculadora {

    public double dividir(int divisor, int numerador) throws DivicionPorZeroException {

        if (divisor == 0) {

            throw new DivicionPorZeroException("No se puede dividir por cero");

        }
        return numerador / (double) divisor;
    }

}

package pooExcepciones.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivicionPorZeroException {

        if (divisor == 0) {

            throw new DivicionPorZeroException("No se puede dividir por cero");

        }
        return numerador / (double) divisor;
    }

    public double dividir(String numerador, String divisor) throws DivicionPorZeroException, FormatoNumeroException {

        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        } catch (NumberFormatException e) {
            throw new FormatoNumeroException("El formato del numero es incorrecto");
        }

    }

}

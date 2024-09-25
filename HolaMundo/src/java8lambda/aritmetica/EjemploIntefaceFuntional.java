package java8lambda.aritmetica;

public class EjemploIntefaceFuntional {
    public static void main(String[] args) {
        Aritmetica suma = Double::sum;
        Aritmetica resta = (a,b) -> a - b;
        Aritmetica multiplicacion = (a,b) -> a * b;
        Aritmetica division = (a,b) -> a / b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10,5, suma));
        System.out.println(cal.computar(10,5, resta));
        System.out.println(cal.computar(10,5, multiplicacion));
        System.out.println(cal.computar(10,5, division));
        System.out.println(cal.computar(10,5, Math::pow));
        System.out.println(cal.computarConBiFuction(10, 5, (a,b) -> a + b));

    }
}

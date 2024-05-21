package pooSobreCarga;

public class Calculadora {

    private Calculadora() {}

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumar(int... argumentos) {
        int total = 0;
        for (int i = 0; i < argumentos.length; i++) {
            total += argumentos[i];
        }
        return total;
    }
    
    public static float sumar(float a, int... argumentos) {
        float total = a;
        for (int i = 0; i < argumentos.length; i++) {
            total += argumentos[i];
        }
        return total;
    }

    public static double sumar(double... argumentos) {
        double total = 0;
        for (int i = 0; i < argumentos.length; i++) {
            total += argumentos[i];
        }
        return total;
    }

    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float sumar(float a, int b) {
        return a + b;
    }

    public static float sumar(int a, float b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(String a, String b) {
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }
}

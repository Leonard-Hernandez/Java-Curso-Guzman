package claseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluta = Math.abs(-3);
        System.out.println("absoluta = " + absoluta);

        absoluta = Math.abs(3);
        System.out.println("absoluta = " + absoluta);

        double max = Math.max(3.5,2.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5,2.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir radianes a grados = " + grados);

        double radianes = Math.toRadians(90);
        System.out.println("radianes = " + radianes);

        System.out.println("seno de 90 = " + Math.sin(radianes));
        System.out.println("coseno de 90 = " + Math.cos(radianes));

        radianes = Math.toRadians(180);

        System.out.println("seno de 180 = " + Math.sin(radianes));
        System.out.println("coseno de 180 = " + Math.cos(radianes));
    }
}

package pooSobreCarga;

public class EjemploSobrecarga {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        System.out.println("sumar enteros : " + cal.sumar(1, 2));
        System.out.println("sumar floats : " + cal.sumar(1.0f, 2.0f));
        System.out.println("sumar doubles : " + cal.sumar(1.0d, 2.0d));
        System.out.println("sumar float-int : " + cal.sumar(1.0f, 2));
        System.out.println("sumar int-float : " + cal.sumar(1, 2.0f));
        System.out.println("sumar string : " + cal.sumar("1", "2"));
        System.out.println("sumar 3 enteros : " + cal.sumar(1, 2, 3));

        System.out.println("sumar long : " + cal.sumar(1L, 2L));
        System.out.println("sumar int : " + cal.sumar(1, '@'));

        System.out.println("sumar varargs " + cal.sumar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("sumar un float n int " + cal.sumar(1.5f, 2,2,2,2,2,2));
        System.out.println("sumanr n cantodad de doubles " + cal.sumar(1.0d, 2.0d, 3.0d, 4.0d, 5.0d, 6.0d, 7.0d, 8.0d, 9.0d, 10.0d));

    }

}

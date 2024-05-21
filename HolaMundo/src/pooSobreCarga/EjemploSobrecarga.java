package pooSobreCarga;

import static pooSobreCarga.Calculadora.*;

public class EjemploSobrecarga {

    public static void main(String[] args) {

        System.out.println("sumar enteros : " + sumar(1, 2));
        System.out.println("sumar floats : " + sumar(1.0f, 2.0f));
        System.out.println("sumar doubles : " + sumar(1.0d, 2.0d));
        System.out.println("sumar float-int : " + sumar(1.0f, 2));
        System.out.println("sumar int-float : " + sumar(1, 2.0f));
        System.out.println("sumar string : " + sumar("1", "2"));
        System.out.println("sumar 3 enteros : " + sumar(1, 2, 3));

        System.out.println("sumar long : " + sumar(1L, 2L));
        System.out.println("sumar int : " + sumar(1, '@'));

        System.out.println("sumar varargs " + sumar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("sumar un float n int " + sumar(1.5f, 2,2,2,2,2,2));
        System.out.println("sumanr n cantodad de doubles " + sumar(1.0d, 2.0d, 3.0d, 4.0d, 5.0d, 6.0d, 7.0d, 8.0d, 9.0d, 10.0d));

    }

}

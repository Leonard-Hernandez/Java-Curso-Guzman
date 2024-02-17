package ejercicios;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserte el primer nombre");
        String nombre1 =scanner.next();

        System.out.println("inserte el segundo nombre");
        String nombre2 =scanner.next();

        System.out.println("inserte el tercero nombre");
        String nombre3 =scanner.next();

        nombre1 = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2));
        nombre2 = nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));
        nombre3 = nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));

        System.out.println(nombre1.concat("_").concat(nombre2).concat("_").concat(nombre3));



    }

}

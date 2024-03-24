package arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {

        String[] a = new String[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un String: ");
            a[i] = scanner.next();
        }

        System.out.println("\r\ningrese el String a buscar");
        String string = scanner.next();

        int i = 0;
        for(;i < a.length && !a[i].equalsIgnoreCase(string);i++){
        }
        if(i == a.length){
            System.out.println("Numero no encontrado");
        } else if (a[i].equalsIgnoreCase(string)) {
            System.out.println("El String fue encontrado en la posicion: " +i);
        }

    }
}

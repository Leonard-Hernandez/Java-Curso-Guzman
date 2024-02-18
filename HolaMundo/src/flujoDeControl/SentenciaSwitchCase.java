package flujoDeControl;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        char num = '0';

        switch (num){
            case '0':
                System.out.println("El num es 0");
                break;
            case '1':
                System.out.println("El num es 1");
                break;
            case '2':
                System.out.println("El num es 2");
                break;
            case '3':
                System.out.println("El num es 3");
                break;
            default:
                System.out.println("Numero o caracter deconocido");

        }

        String nombre = "pepe";

        switch (nombre){
            case "admin":
                System.out.println("Bienvenido admin");
                break;
            case "leonard":
                System.out.println("Bienvenido leonard");
            case "pepe":
                System.out.println("Bienvenido pepe");
                break;
            default:
                System.out.println("Usuario desconocido");

        }
    }
}

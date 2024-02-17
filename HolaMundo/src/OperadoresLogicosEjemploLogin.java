import java.util.Scanner;

public class OperadoresLogicosEjemploLogin {

    public static void main(String[] args) {

        /*String[] usernames = new String[2];
        String[] passwords = new String[2];
        usernames[0] ="leonard";
        passwords[0] = "1234";

        usernames[1]= "admin";
        passwords[1] = "12345";*/

        String[] usernames = {"leonard", "admin"};
        String[] passwords = {"1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String usuario = scanner.next();

        System.out.println("ingrese la contraseña");
        String contraseña = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){

            if( usernames[i].equals(usuario) && passwords[i].equals(contraseña)){
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        }else {
            System.out.println("Credenciales incorrectas");
            System.out.println("Necesitas autenticacion");
        }
    }
}

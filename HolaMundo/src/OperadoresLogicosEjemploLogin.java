import java.util.Scanner;

public class OperadoresLogicosEjemploLogin {
    public static void main(String[] args) {
        String username = "leonard";
        String password = "1234";

        String username2 = "admin";
        String password2 = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String usuario = scanner.next();

        System.out.println("ingrese la contraseña");
        String contraseña = scanner.next();

        boolean esAutenticado = false;

        if( username.equals(usuario) && password.equals(contraseña) ||
                username2.equals(usuario) && password2.equals(contraseña)){
            esAutenticado = true;
        } else {
            System.out.println("Credenciales incorrectas");
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        }else {
            System.out.println("Necesitas autenticacion");
        }
    }
}

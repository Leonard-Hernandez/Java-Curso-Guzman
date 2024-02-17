import java.util.Scanner;

public class EjercicioEstanqueGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los litros del estanque");
        Integer litros = scanner.nextInt();

        if (70 == litros){
            System.out.println("El tanque esta lleno");
        } else if (60 <= litros && 70 > litros) {
            System.out.println("El tanque esta casi lleno");
        } else if (40 <= litros && 60 > litros) {
            System.out.println("El tanque esta 3/4");
        } else if (35 <= litros && 40 > litros) {
            System.out.println("Medio tanque");
        } else if (20 <= litros && 35 > litros) {
            System.out.println("Suficiente");
        } else if (1 <= litros && 20 > litros) {
            System.out.println("Insuficiente");
        }

    }
}

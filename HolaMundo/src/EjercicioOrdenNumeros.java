import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EjercicioOrdenNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero 1/2");
        Integer num1 = scanner.nextInt();

        System.out.println("Ingrese un numero 1/2");
        Integer num2 = scanner.nextInt();

        Integer max = num1 > num2 ? num1:num2;
        Integer min = num1 < num2 ? num1:num2;

        System.out.println(max +" > " + min);

    }
}

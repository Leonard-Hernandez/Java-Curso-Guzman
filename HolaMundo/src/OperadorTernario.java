import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condicion ? si es verdadero: si es_falso;
        String variable = 7==6 ? "si es verdadero": "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas en escala de 7");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese la nota de ciencias en escala de 7");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese la nota de historia en escala de 7");
        historia = scanner.nextDouble();

        promedio = (matematicas+ciencias+historia)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado":"Reprobado";
        System.out.println("estado = " + estado);


    }
}

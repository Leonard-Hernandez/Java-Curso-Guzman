package ejercicios;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class EjercicioMultiplicarDosNumerosSinSignoDeMultiplicacion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        Double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero");
        Double num2 = scanner.nextDouble();

        Double resultado = 0.0;
        Double aux = 0.0;

        if(num1 > 0 && num2 > 0){
            for (int i = 0; i<num2; i++){
                resultado += num1;
            }
        }

        if(num1 < 0 && num2 > 0){
            for (int i = 0; i<num2;i++){
                aux = -num1;
                resultado += aux;
            }
            resultado = -resultado;
        }

        if(num1 > 0 && num2 < 0){
            for (int i = 0; i<num1;i++){
                aux = -num2;
                resultado += aux;
            }
            resultado = -resultado;
        }

        if (num1 < 0 && num2 <0){
            num1 = -num1;
            num2 = -num2;
            for(int i=0; i < num2; i++){
                resultado += num1;
            }
        }



        System.out.println(resultado);

    }
}

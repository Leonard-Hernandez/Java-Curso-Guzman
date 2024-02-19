package flujoDeControl;

import java.util.Scanner;

public class SentenciaIfElseNumeroDiasMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el mes");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año");
        int anio = scanner.nextInt();

        int numerosDias = 0;

        if(mes == 1 || mes ==3 || mes ==5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numerosDias=32;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numerosDias = 30;
        } else if (mes == 2) {

            if(anio % 400 == 0 || (anio %4 == 0) && !(anio % 100 == 0)){
                numerosDias = 29;
            }else {
                numerosDias = 28;
            }

        }

        System.out.println(numerosDias);

    }
}

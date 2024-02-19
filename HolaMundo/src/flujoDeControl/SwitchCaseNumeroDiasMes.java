package flujoDeControl;

import java.util.Scanner;

public class SwitchCaseNumeroDiasMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el mes");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año");
        int anio = scanner.nextInt();
        int numerosDias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 8:
            case 10:
            case 12:
                numerosDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numerosDias = 30;
            case 2:
                if (anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)) {
                    numerosDias = 29;
                } else {
                    numerosDias = 28;
                }
                break;
            default:
                System.out.println("Numero de dias indefiniso");
        }

        /*if(mes == 1 || mes ==3 || mes ==5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numerosDias=32;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numerosDias = 30;
        } else if (mes == 2) {

            if(anio % 400 == 0 || (anio %4 == 0) && !(anio % 100 == 0)){
                numerosDias = 29;
            }else {
                numerosDias = 28;
            }

        }*/

        System.out.println(numerosDias);

    }
}



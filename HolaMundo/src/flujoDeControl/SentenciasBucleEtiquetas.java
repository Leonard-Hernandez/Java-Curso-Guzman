package flujoDeControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle:
        for (int i = 1; i <= 7; i++) {

            System.out.println();
            int j = 1;
            while(j<=8){
                if (i == 6 || i == 7) {
                    System.out.println("Dia "+ i + ": Descanso de fin de semana");
                    continue bucle;
                }
                System.out.println("Dia " + i + ": Dia de trabajo las " + j);
                j++;
            }
        }

        bucle1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;
            while(j<5){

                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("i = " + i + " , " + j);
                j++;
            }
        }

        System.out.println("\n-----------------------------------------------------------");
        bucle2:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    break bucle2;
                }
                System.out.print("i = " + i + " , " + j);
            }
        }
    }
}

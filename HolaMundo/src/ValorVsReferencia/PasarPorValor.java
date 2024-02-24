package ValorVsReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        Integer i = 20;

        System.out.println("inicioamos el main con i = " + i);
        test(i);
        System.out.println("finaliza con main en " + i);

    }

    public static void test(Integer i){
        System.out.println("iniciamos el metodo test con i =  " + i);
        i= 35;
        System.out.println("finaliza con test en = " + i);
    }
}

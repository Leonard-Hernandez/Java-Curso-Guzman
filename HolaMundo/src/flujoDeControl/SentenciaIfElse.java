package flujoDeControl;

public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 5.5F;

        if(6.5 <= promedio){
            System.out.println("Es excelente el promedio");
        }else if(6<= promedio){
            System.out.println("Muy buen promedio");
        } else if(5.5 <= promedio){
            System.out.println("Buen promedio");
        } else if (5.0 <= promedio) {
            System.out.println("Regular");
        } else if (4.0 <= promedio) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Reprobaste");
        }
        System.out.println("promedio = " + promedio);

    }
}

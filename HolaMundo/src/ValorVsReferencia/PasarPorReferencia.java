package ValorVsReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,14};

        System.out.println("inicioamos el main");
        for(int i = 0; i< edad.length; i++){
            System.out.println("edad = "+ edad[i]);
        }
        System.out.println("Antes de invocar el metodo test");
        test(edad);
        System.out.println("Despues de llamar el metodo test");
        for(int i = 0; i< edad.length; i++){
            System.out.println("edad = "+ edad[i]);
        }
        System.out.println("finaliza con main datos arreglo modificados");

    }

    public static void test(int[] edadArr){
        System.out.println("iniciamos el metodo test");
        for(int i = 0; i< edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("finaliza con test");
    }
}

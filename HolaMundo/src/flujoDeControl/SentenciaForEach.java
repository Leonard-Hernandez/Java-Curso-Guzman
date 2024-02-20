package flujoDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1,3,5,7,9,13,15};
        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Leonard", "Lubraska", "Anfres", "Pepe", "Maria", "Pepa"};

        for(String nombre: nombres){
            System.out.println(nombre);
        }
    }
}

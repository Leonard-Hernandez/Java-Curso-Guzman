package claseMath;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "lila", "ambar"};

        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);

        // Se usa flor para que no falle en el momento de buscar en el indice del arreglo
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        Random randomObj = new Random();

        //genera un random que va desde el valor minimo del int hasta su valor maximo
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);

        //le podemos agregar un limite no inclusivo
        randomInt = 15 + randomObj.nextInt(25-15);
        System.out.println("randomInt = " + randomInt);

        long randomLong = randomObj.nextLong();
        System.out.println("randomLong = " + randomLong);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("color = " + colores[randomInt]);
    }
}

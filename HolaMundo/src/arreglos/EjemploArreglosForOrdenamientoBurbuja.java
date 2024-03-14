package arreglos;

import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public  static void sortBorbuja(Object[] arreglo){
        for(int i = 0; i< arreglo.length;i++){

            for (int j = 0; j< arreglo.length-1 -i; j++){
                if( ((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
    }
    public static void main(String[] args) {

       String[] productos = {
                "Kingston pendrive 64gb",
                "Samsung Galaxy",
                "Disco Duro SSD Samsumg externo",
                "Asus notebook",
                "Macbook air",
                "Chromecast 4ta generacion",
                "Bicicleta oxford"
        };

        sortBorbuja(productos);

        System.out.println("========= usando for =========");
        for(int i = 0; i< productos.length; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 1;
        numeros[1] = 0;
        numeros[2] = 3;
        numeros[3] = 4;

        sortBorbuja(numeros);
        for(int i = 0; i< numeros.length; i++){
            System.out.println("numeros = " + numeros[i]);

        }

    }
}

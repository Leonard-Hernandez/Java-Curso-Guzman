package arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i<total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i]= actual;
            total2--;
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

        int total = productos.length;

        Arrays.sort(productos);
        arregloInverso(productos);

        //mismo resultado usando la api de java
        //Collections.reverse(Arrays.asList(productos));

        System.out.println("========= usando for =========");
        for(int i = 0; i<total; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }
    }
}

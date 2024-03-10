package arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];

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

        /*
        productos[0] = "Kingston pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsumg externo";
        productos[3] = "Asus notebook";
        productos[4] = "Macbook air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta oxford";
        */

        Arrays.sort(productos);

        System.out.println("========= usando for =========");
        for(int i = 0; i<total; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }

        System.out.println("========= usando for inverso =========");
        for(int i = 0; i < total; i++){
            System.out.println("para el indice " + (total-1-i) + " : " + productos[total-1-i]);
        }

        System.out.println("========= usando for inverso 2 =========");
        for(int i = total-1; i >= 0; i--){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }



    }
}

package arreglos;

import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
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

        for(int i = 0; i<total;i++){

            for (int j = 0; j< total-1 -i; j++){
                if(productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
            }
        }
        //Arrays.sort(productos);
        //arregloInverso(productos);

        //mismo resultado usando la api de java
        //Collections.reverse(Arrays.asList(productos));

        System.out.println("========= usando for =========");
        for(int i = 0; i<total; i++){
            System.out.println("para el indice " + i + " : " + productos[i]);
        }
    }
}

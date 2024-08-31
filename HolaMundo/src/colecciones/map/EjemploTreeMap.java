package colecciones.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class EjemploTreeMap {
    public static void main(String[] args) {
        
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());

        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Roe");
        persona.put("email", "john.doe@carvajal.com");
        persona.put("edad", 30);

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "Venezuela");
        direccion.put("estado", "Tachira");
        direccion.put("ciudad", "San Cristobal");
        direccion.put("calle", "calle 13");
        direccion.put("numero", "25d");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);
        
    }
}

package colecciones.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        
        Map<String, String> persona = new HashMap<>();

        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@carvajal.com");
        persona.put("edad", "30");

        

    }
}

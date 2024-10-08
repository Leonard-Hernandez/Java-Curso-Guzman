package colecciones.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        
        Map<String, Object> persona = new HashMap<>();
        System.out.println("Tiene elementos " + !persona.isEmpty());

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

        String nombre = (String) persona.get("nombre");
        System.out.println(nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println(apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "Centro");
        System.out.println("el pais de " + nombre + " es: " + pais);
        System.out.println("la ciudad de " + nombre + " es: " + ciudad);
        System.out.println("el barrio de " + nombre + " es: " + barrio);

        // devuelve el valor eliminado
        String valor = (String) persona.remove("apellidoPaterno");
        // devuelve un boolean dependiendo de si se borro
        boolean eliminado = persona.remove("apellido", "Doe");

        System.out.println("devuelve el valor borrado: " + valor);
        System.out.println("eliminado = " + eliminado);

        boolean contiene = persona.containsValue("30");
        System.out.println("contiene la el valor 30 = " + contiene);

        Collection<Object> valores =  persona.values();

        for(Object v: valores){
            System.out.println("Valor = " + v);
        }

        Set<String> llaves = persona.keySet();
        for(String k: llaves){
            System.out.println("Llave = " + k);
        }

        System.out.println("=============================== entrySet");
        for(Map.Entry<String, Object> par: persona.entrySet()){
            Object v = par.getValue();
            String name = (String) persona.get("nombre");
            if (v instanceof Map) {
                Map<String, String> direccionMap = (Map<String, String>) v;
                
                for(Map.Entry<String,String> parDir: direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }

            }else{
                System.out.println(par.getKey() + " => " + v);
            }
        }
        System.out.println("=============================== keySet");
        for(String llave: persona.keySet()){
            Object v =  persona.get(llave);
            String name = (String) persona.get("nombre");
            if (v instanceof Map) {
                Map<String, String> direccionMap = (Map<String, String>) v;
                System.out.println("El pais de " + name + ": " + direccionMap.get("pais"));
                System.out.println("la ciudadd de " + name + ": " + direccionMap.get("ciudad"));
                System.out.println("el estado de " + name + ": " + direccionMap.get("estado"));

            }else{
                System.out.println(llave + " => " + v);
            }
        }

        System.out.println("=============================== java 8 forEach");
        persona.forEach((llave, v) ->{
            System.out.println(llave + " => " + v);
        });

        System.out.println("total " + persona.size());
        System.out.println("Tiene elementos " + !persona.isEmpty());
        persona.replace("nombre", "Leonard");
        System.out.println("persona " + persona);


    }
}

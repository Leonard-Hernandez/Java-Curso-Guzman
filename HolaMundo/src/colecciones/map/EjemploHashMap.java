package colecciones.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        
        Map<String, String> persona = new HashMap<>();
        System.out.println("Tiene elementos " + !persona.isEmpty());

        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Roe");
        persona.put("email", "john.doe@carvajal.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println(nombre);
        String apellido = persona.get("apellido");
        System.out.println(apellido);

        // devuelve el valor eliminado
        String valor = persona.remove("apellidoPaterno");
        // devuelve un boolean dependiendo de si se borro
        boolean eliminado = persona.remove("apellido", "Doe");

        System.out.println("devuelve el valor borrado: " + valor);
        System.out.println("eliminado = " + eliminado);

        boolean contiene = persona.containsValue("30");
        System.out.println("contiene la el valor 30 = " + contiene);

        Collection<String> valores = persona.values();

        for(String v: valores){
            System.out.println("Valor = " + v);
        }

        Set<String> llaves = persona.keySet();
        for(String k: llaves){
            System.out.println("Llave = " + k);
        }

        System.out.println("=============================== entrySet");
        for(Map.Entry<String, String> par: persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }
        System.out.println("=============================== keySet");
        for(String llave: persona.keySet()){
            String v = persona.get(llave);
            System.out.println(llave + " => " + v);
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

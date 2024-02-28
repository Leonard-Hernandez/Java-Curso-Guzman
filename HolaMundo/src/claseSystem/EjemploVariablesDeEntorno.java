package claseSystem;

import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("variables de ambiente = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temHome = System.getenv("TEMP");
        System.out.println("temdir = " + temHome);

        String path = System.getenv("PATH");
        System.out.println("PATH = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("PATH2 = " + path);

        //Variable de entrono creada por nosotros mismos
        String appenv = System.getenv("APLICATION_ENV");
        System.out.println("appenv = " + appenv);

        String hola = System.getenv("SALUDAR_HOLA");
        System.out.println("hola = " + hola);

        System.out.println("Listando variables de entorno del sistema");
        for (String key: varEnv.keySet()){

            System.out.println(key + "=>" + varEnv.get(key));

        }


    }
}

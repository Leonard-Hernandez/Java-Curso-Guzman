package Wrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hpña que tal?";

        Class strClass = texto.getClass();
        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for(Method m: strClass.getMethods()){
            System.out.println("metodo.getName() = " + m.getName());
        }

        Integer numero =43;
        Class intClass = numero.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass.getSuperclass());
        System.out.println("intClass = " + intClass.getSuperclass().getSuperclass());

        for(Method m: objClass.getMethods()){
            System.out.println("metodo.getName() = " + m.getName());
        }

    }
}

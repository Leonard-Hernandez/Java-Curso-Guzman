package java8lambda;

import java8lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String[] args) {
        Predicate<Integer> test = num -> num >10;
        boolean resultado = test.test(9);
        System.out.println("resultado = " + resultado);

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        boolean resultado2 = test2.test("ROLE_ADMIN");
        System.out.println("resultado2 = " + resultado2);

        BiPredicate<String, String> test3 = String::equals;
        boolean resultado3 = test3.test("leonard", "leonard");
        System.out.println("resultado3 = " + resultado3);

        BiPredicate<Integer, Integer> test4 = (a, b) -> a > b;
        boolean resultado4 = test4.test(3,2);
        System.out.println("resultado4 = " + resultado4);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Leonard");
        b.setNombre("Lubraska");
        
        BiPredicate<Usuario, Usuario> test5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        boolean resultado5 = test5.test(a,b);
        System.out.println("resultado5 = " + resultado5);
        
    }

}

package ejercicios.generadorAleatorio;

import ejercicios.generadorAleatorio.modelo.LetterGenerator;
import ejercicios.generadorAleatorio.modelo.RandomGenerator;

public class ExampleLetterGenerator {

    public static void main(String[] args) {
        
        RandomGenerator<Character> letterGenerator = new LetterGenerator();

        System.out.println(Character.toUpperCase(letterGenerator.generate()));

    }

}

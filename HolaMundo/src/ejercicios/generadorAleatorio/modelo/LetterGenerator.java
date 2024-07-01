package ejercicios.generadorAleatorio.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LetterGenerator extends RandomGenerator<Character> {

    private List<Character> source;
    Random random= new Random();

    public LetterGenerator() {
        source = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
    }

    public void setSource(List<Character> source) {
        this.source = source;
    }

    @Override
    public Character generate() {

        return source.get(random.nextInt(source.size()+1));

    }

}

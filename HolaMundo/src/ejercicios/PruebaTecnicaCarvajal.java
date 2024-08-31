package ejercicios;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PruebaTecnicaCarvajal {

    public static void main(String[] args) {

        List<Integer> myArray = List.of(1, 3, 4, 2, 7);

        Set<Integer> complemetos = new HashSet<>();
        for (int num : myArray) {
            int complemeto = 10 - num;
            if (complemetos.contains(complemeto)) {
                System.out.println(num + " " + complemeto);
            }

            complemetos.add(num);
        }

    }

}

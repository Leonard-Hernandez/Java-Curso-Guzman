public class EjemploMatrizStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {
                {"Pepe", "Pepa"},
                {"Josefa", "Paco"},
                {"Lucas", "Pancha"}
        };
        /*
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Josefa";
        nombres[1][1] = "Paco";
        nombres[2][0] = "Lucas";
        nombres[2][1] = "Pancha";
        */

        for (String[] fila: nombres) {
            for (String nombre: fila) {
                System.out.print(nombre +"\t");
            }
            System.out.println();
        }

    }

}

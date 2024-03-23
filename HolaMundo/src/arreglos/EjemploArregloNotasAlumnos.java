package arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claselenguaje;
        int sumNotasMatematicas =0, sumNotasHistoria =0, sumNotasLenguaje = 0;

        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claselenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese 7 notas para estudiantes matematicas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("ingrese 7 notas para estudiantes historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = scanner.nextDouble();
        }

        System.out.println("ingrese 7 notas para estudiantes Lenguaje");
        for (int i = 0; i < claselenguaje.length; i++) {
            claselenguaje[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claselenguaje[i];
        }

        double promedioMatematicas = sumNotasMatematicas/claseMatematicas.length;
        double promedioHistoria = sumNotasHistoria/claseHistoria.length;
        double promedioLenguaje = sumNotasLenguaje/claselenguaje.length;

        System.out.println("Promedio para clase matematicas" + (promedioMatematicas));
        System.out.println("Promedio para clase historia" + promedioHistoria);
        System.out.println("Promedio para clase lenguaje" + promedioLenguaje);
        System.out.println("Promedio total del curso " + (promedioHistoria+promedioMatematicas+promedioLenguaje)/3);

        System.out.println("Ingrese el identificador del alumno (de 0- 6): ");
        int id = scanner.nextInt();
        double promedioAlumno = (claseMatematicas[id]+claseHistoria[id]+claselenguaje[id])/3;
        System.out.println("promedio de el alumno es: " + promedioAlumno);



    }
}

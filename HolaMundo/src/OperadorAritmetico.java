import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i =5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println("(i + j) = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i-j));

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        double div =(double) i / j;
        System.out.println("divicion = " + div);
        
        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        if(numero % 2 == 0){
            System.out.println("es par");
        } else {
            System.out.println("impar");
        }

    }
}

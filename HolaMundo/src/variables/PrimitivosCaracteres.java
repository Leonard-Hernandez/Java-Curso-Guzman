package variables;

public class PrimitivosCaracteres {

    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter " + caracter);
        System.out.println("decimal " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';

        System.out.println("simbolo " + simbolo);
        System.out.println("simbolo = caracter: " + (caracter == simbolo));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';

        System.out.println("char corresponde en bytes ="+ espacio + Character.BYTES);
        System.out.println("char corresponde en bites ="+retroceso + Character.SIZE);
        System.out.println("character min value ="+ tabulador + Character.MIN_VALUE);
        System.out.println("charater max value ="+ nuevaLinea + Character.MAX_VALUE);
        System.out.println("charater max value ="+ System.lineSeparator() + Character.MAX_VALUE);


    }

}

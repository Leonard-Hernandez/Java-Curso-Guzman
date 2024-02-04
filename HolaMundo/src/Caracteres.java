public class Caracteres {

    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter " + caracter);
        System.out.println("decimal " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';

        System.out.println("simbolo " + simbolo);
        System.out.println("simbolo = caracter: " + (caracter == simbolo));

        System.out.println("char corresponde en bytes =" + Character.BYTES);
        System.out.println("char corresponde en bites =" + Character.SIZE);
        System.out.println("character min value = "+ Character.MIN_VALUE);
        System.out.println("charater max value = " + Character.MAX_VALUE);
    }

}

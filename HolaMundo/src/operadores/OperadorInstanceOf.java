package operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase string";

        Integer num = 7;

        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo string = " + b1);

        boolean b2 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b2);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer " + b1);

        b1 = num instanceof Number;
        System.out.println("num es instancia de Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es instancia de Object = " + b1);

        Double decimal = 45.43;
        b1 = decimal instanceof Number;
        System.out.println("deciaml es una instacia de number " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es una instacia de Boolean " + b1);


    }
}

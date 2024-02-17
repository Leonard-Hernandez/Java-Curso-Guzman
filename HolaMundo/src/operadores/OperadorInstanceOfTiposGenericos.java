package operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase string";

        Number num = Integer.valueOf(7); //7;

        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo string = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es instacia de Integer " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer " + b1);

        b1 = num instanceof Number;
        System.out.println("num es instancia de Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es instancia de Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es instacia de Long " + b1);

        b1 = num instanceof Double;
        System.out.println("num es instacia de Double " + b1);

        Number decimal =Float.valueOf(45.43f);

        b1 = decimal instanceof Double;
        System.out.println("decimal es instacia de Double " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es instacia de float " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es una instacia de number " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es una instacia de Boolean " + b1);


    }
}

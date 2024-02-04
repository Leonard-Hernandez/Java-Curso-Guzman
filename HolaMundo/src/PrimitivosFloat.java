public class PrimitivosFloat {

    public static void main(String[] args) {

        float realfloat = 2.12e-3f; //1.0f;
        System.out.println(realfloat);

        System.out.println("float corresponde en bytes a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("valor maximo de un float:" + Float.MAX_VALUE);
        System.out.println("valor minimo de un flaot:" + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;

        System.out.println(realDouble);

        System.out.println("double corresponde en bytes a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("valor maximo de un double:" + Double.MAX_VALUE);
        System.out.println("valor minimo de un double:" + Double.MIN_VALUE);

        //automaticamente se vuelve double cuando tiene el punto
        var varFlotante = 3.1216;
        System.out.println(varFlotante);

    }

}

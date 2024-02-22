package Wrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 3213123;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = 3213123;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shorObjeto = intObjeto.shortValue();
        System.out.println("shorObjeto = " + shorObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}

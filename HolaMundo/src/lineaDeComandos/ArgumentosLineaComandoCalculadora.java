package lineaDeComandos;

public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Por favor ingresar una operacion y dos numeros enteros " +
                    "(suma, resta, multiplicacion, division) ");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.0;

        switch (operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multiplicacion":
                resultado = a*b;
                break;
            case "divicion":
                if(b == 0){
                    System.err.println("Nose puede dividir por 0");
                    System.exit(-1);
                }
                resultado = (double)a/b;
            default:
                System.err.println("Operacion no soportada");
                System.exit(-1);
        }
        System.out.println("resultado de la operacion '" + operacion + "' es: " +resultado);
    }
}

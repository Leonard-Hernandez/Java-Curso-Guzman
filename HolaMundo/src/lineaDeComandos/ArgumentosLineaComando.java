package lineaDeComandos;

public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("error");
            System.exit(-1);
        }
        for(int i = 0; i< args.length; i++ ){
            System.out.println("argumentos nro" + i+ ": " + args[i]);
        }

        // compilamos por terminal con javac y ejecutamos con java, para que no de problemas
        //con caracteres especiales podemos agregar la bandera -encoding utf8
    }
}

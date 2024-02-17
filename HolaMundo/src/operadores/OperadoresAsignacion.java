package operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i+4;

        i += 2; // i = i +2
        System.out.println("i = " + i);

        j -= 4;
        System.out.println("j = " + j);

        j *= 5;
        System.out.println("j = " + j);

        i /= 2;
        System.out.println("i = " + i);

        String sqlString = "Select * from clientes as c";
        sqlString += " where c.nombre= 'andres' ";
        sqlString += " and c.activo =1";
        System.out.println("sqlString = " + sqlString);
    }
}

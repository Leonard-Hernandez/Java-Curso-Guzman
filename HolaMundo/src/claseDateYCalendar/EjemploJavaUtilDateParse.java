package claseDateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            System.out.println("Ingrese una feucha con formato 'yyyy-MM-dd'");
            Date fecha = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
            
            Date fecha2 = new Date();
            
            if(fecha.after(fecha2)){
                System.out.println("Fecha1 es despues o mayor a fecha2");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha1 es anterior fecha2");
            }else if(fecha.equals(fecha2)){
                System.out.println("fechas Iguales");
            }

            if(fecha.compareTo(fecha2)>0){
                System.out.println("Fecha1 es despues o mayor a fecha2");
            } else if (fecha.compareTo(fecha2)<0) {
                System.out.println("Fecha1 es anterior fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fechas iguales");
            }


        } catch (ParseException e) {
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser: 'yyyy-MM-dd'");
            //System.exit(1);
            main(args);
        }
        
        
    }
}
package claseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            //ponemos mal la carpeta para ver el system,err
            FileInputStream archivo = new FileInputStream("src/claseSystem/confi.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personaliazada","mi valor guardado en properties");


            System.setProperties(p);

            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.err.println("no existe el archivo " + e);
            System.exit(1);
        }


    }
}

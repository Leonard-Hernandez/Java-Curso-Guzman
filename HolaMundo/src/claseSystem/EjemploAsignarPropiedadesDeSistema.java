package claseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/claseSystem/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personaliazada","mi valor guardado en properties");


            System.setProperties(p);

            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.out.println("no existe el archivo " + e);
        }

    }
}

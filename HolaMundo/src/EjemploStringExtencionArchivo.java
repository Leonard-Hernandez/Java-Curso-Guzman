public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.png";
        System.out.println("archivo.length() = " + archivo.length());
        int i = archivo.lastIndexOf(".");
        System.out.println("extencion = ".concat(archivo.substring(i+1)));
    }
}

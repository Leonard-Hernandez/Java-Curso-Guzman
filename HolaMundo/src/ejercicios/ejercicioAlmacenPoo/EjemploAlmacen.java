package ejercicios.ejercicioAlmacenPoo;

public class EjemploAlmacen {

    public static void main(String[] args) {

        Lacteo leche = new Lacteo("Leche", 1.5, 3, 2);
        Lacteo Queso = new Lacteo("Queso", 2.5, 5, 4);

        Fruta fresa = new Fruta("Fresa", 0.5, 0.5, "Rojo");
        Fruta Manzana = new Fruta("Manzana", 0.5, 0.5, "Verde");

        Limpieza limpieza = new Limpieza("Suavitel", 0.5, "Cera", 1.5);
        Limpieza jabon = new Limpieza("Dove", 0.5, "Jabon", 2.5);

        NoPerecible noPerecible = new NoPerecible("Coca Cola", 0.5, 2, 300);
        NoPerecible agua = new NoPerecible("Agua", 0.5, 2, 500);

        Producto[] almacen = {leche, Queso, fresa, Manzana, limpieza, jabon, noPerecible, agua};

        for(Producto prod: almacen){
            System.out.println(prod + "\n");
        }
        
    }

}

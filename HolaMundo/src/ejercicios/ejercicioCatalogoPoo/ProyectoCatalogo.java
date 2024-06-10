package ejercicios.ejercicioCatalogoPoo;


import java.util.Date;

import ejercicios.ejercicioCatalogoPoo.modelo.*;

public class ProyectoCatalogo {

    public static void main(String[] args) {

        IProducto[] catalogo = new IProducto[5];

        catalogo[0] = new IPhone( 20000, "Apple", "iPhone 11", "Negro");
        catalogo[1] = new TvLcd( 30000, "Samsung", 55);
        catalogo[2] = new Libro(20000, "George Orwell", "Norma", "1984", new Date(System.currentTimeMillis()));
        catalogo[3] = new Comics(25000, "DC", "DC Comics", "Batman", new Date(System.currentTimeMillis()), "Bruce Wayne");
        catalogo[4] = new IPhone(25000, "Apple", "iPhone 12", "Negro");


        for (IProducto p : catalogo) {

            if(p instanceof Libro){

                Libro l = (Libro) p;

                System.out.print("Libro: " + l.getAutor() + " - " + l.getEditorial() + " - " + l.getTitulo() + " - " + l.getFechaPublicacion()+ " ");
            }

            if (p instanceof IPhone) {
                IPhone i = (IPhone) p;
                System.out.print("IPhone: " + i.getModelo() + " - " + i.getColor() + " ");                
            }

            if (p instanceof TvLcd) {
                TvLcd t = (TvLcd) p;
                System.out.print( "TvLcd: " + t.getFabricante() + " " + t.getPulgadas() + " ");
            }

            if (p instanceof Comics) {
                Comics c = (Comics) p;
                System.out.print("Comics: " + c.getAutor() + " - " + c.getEditorial() + " - " + c.getTitulo() + " - " + c.getFechaPublicacion()+ " ");
            }

            System.out.println(p.getPrecioVenta());
        }

    }

}

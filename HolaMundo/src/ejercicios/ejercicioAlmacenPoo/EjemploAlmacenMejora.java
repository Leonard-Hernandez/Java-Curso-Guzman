package ejercicios.ejercicioAlmacenPoo;

import java.time.LocalDate;

public class EjemploAlmacenMejora {

    public static void main(String[] args) {
        
        Vendedor vendedor1 = new Vendedor("Andres", "Gonzalez", "andres@andrez", 10000, 0);
        Vendedor vendedor2 = new Vendedor("Leonardo", "Fernandez", "leonardo@fernandez", 10000, 0);

        Cliente cliente1 = new Cliente("Peter", "Perez", "peter@perez", 0, 0);
        Cliente cliente2 = new Cliente("Juan", "Perez", "juan@perez", 0, 0);

        Perecible per1 = new Perecible("perecible1", 10d, LocalDate.now());
        Limpieza lim1 = new Limpieza("limpieza1", 10d, "papel", 10d);
        NoPerecible noPer1 = new NoPerecible("noPerecible1", 10d, 10, 10);
        NoPerecible noPer2 = new NoPerecible("lata", 10d, 0, 0);

        cliente1.hacerCompras(per1, vendedor1);
        cliente2.hacerCompras(lim1, vendedor2);
        cliente1.hacerCompras(noPer1, vendedor1);

        System.out.println(vendedor1);
        System.out.println(vendedor2);
        System.out.println(cliente1);
        System.out.println(cliente2);
        

    }
}

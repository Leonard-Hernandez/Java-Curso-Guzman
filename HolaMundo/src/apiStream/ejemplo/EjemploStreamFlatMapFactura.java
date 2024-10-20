package apiStream.ejemplo;

import java.util.Arrays;
import java.util.List;

import apiStream.ejemplo.models.Factura;
import apiStream.ejemplo.models.Usuario;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Lubraska", "Ferreira");
        Usuario u2 = new Usuario("Andres", "Guzman");

        u1.addFactura(new Factura("Compras tecnologia"));
        u1.addFactura(new Factura("Compras supermercado"));

        u2.addFactura(new Factura("Compras supermercado"));
        u2.addFactura(new Factura("Compras tecnologia"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);

        usuarios.stream()
        .flatMap(u -> u.getFacturas().stream())
        .forEach(System.out::println);

    }

}

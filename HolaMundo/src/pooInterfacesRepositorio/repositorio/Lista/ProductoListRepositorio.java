package pooInterfacesRepositorio.repositorio.Lista;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import pooInterfacesRepositorio.modelo.Producto;
import pooInterfacesRepositorio.repositorio.AbstractaListRepositorio;
import pooInterfacesRepositorio.repositorio.Dirrecion;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {

    @Override
    public List<Producto> listar(String campo, Dirrecion dir) {

        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(new Comparator<Producto>() {

            @Override
            public int compare(Producto a, Producto b) {
                int resultado = 0;
                if (dir == Dirrecion.ASC) {

                    resultado = ordenar(campo, a, b);

                } else if (dir == Dirrecion.DESC) {
                    resultado = ordenar(campo, b, a);
                }
                return resultado;
            }

        });

        return listaOrdenada;

    }

    @Override
    public void editar(Producto producto) {
        Producto p = this.porId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    private int ordenar(String campo, Producto a, Producto b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getId().compareTo(b.getId());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }

}

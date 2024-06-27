package pooInterfacesRepositorio.repositorio.Lista;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import pooInterfacesRepositorio.modelo.Cliente;
import pooInterfacesRepositorio.repositorio.AbstractaListRepositorio;
import pooInterfacesRepositorio.repositorio.Dirrecion;
import pooInterfacesRepositorio.repositorio.excepciones.LecturaAccesoDatoException;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

    @Override
    public void editar(Cliente cliente) throws LecturaAccesoDatoException {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellidos(cliente.getApellidos());
    }

    @Override
    public List<Cliente> listar(String campo, Dirrecion dir) {

        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(new Comparator<Cliente>() {

            @Override
            public int compare(Cliente a, Cliente b) {
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

    private int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellidos" -> resultado = a.getApellidos().compareTo(b.getApellidos());
        }
        return resultado;
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}

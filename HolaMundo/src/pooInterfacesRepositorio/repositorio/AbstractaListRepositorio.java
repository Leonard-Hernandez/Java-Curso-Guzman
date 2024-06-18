package pooInterfacesRepositorio.repositorio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import pooInterfacesRepositorio.modelo.Cliente;

public abstract class AbstractaListRepositorio<T> implements OrdenablePaginableCrudRepositorio<Cliente> {

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    /*@Override
    public Cliente porId(Integer id) {
        Cliente c = null;

        for (Cliente cli : dataSource) {
            {

                if (cli.getId() != null && cli.getId().equals(id)) {
                    c = cli;
                    break;
                }
            }

        }
        return c;
    }*/

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellidos(cliente.getApellidos());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    /*@Override
    public List<Cliente> listar(String campo, Dirrecion dir) {

        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(new Comparator<Cliente>() {

            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado = 0;
                if (dir == Dirrecion.ASC) {

                    resultado = this.ordenar(a, b);

                } else if (dir == Dirrecion.DESC) {
                    resultado = this.ordenar(b, a);
                }
                return resultado;
            }

            private int ordenar(Cliente a, Cliente b) {
                int resultado = 0;
                switch (campo) {
                    case "id" -> resultado = a.getId().compareTo(b.getId());
                    case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                    case "apellidos" -> resultado = a.getApellidos().compareTo(b.getApellidos());
                }
                return resultado;
            }

        });

        return listaOrdenada;

    }*/

    @Override
    public int total() {
        return this.dataSource.size();
    }
}

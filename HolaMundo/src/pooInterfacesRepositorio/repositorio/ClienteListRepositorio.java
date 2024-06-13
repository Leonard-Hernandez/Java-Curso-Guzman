package pooInterfacesRepositorio.repositorio;

import java.util.ArrayList;
import java.util.List;

import pooInterfacesRepositorio.modelo.Cliente;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio,
        PaginableRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
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
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
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
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public List<Cliente> listar(String campo, Dirrecion dir) {

        dataSource.sort((Cliente a, Cliente b) -> {
            int resultado = 0;
            if (dir == Dirrecion.ASC) {

                switch (campo) {
                    case "id" -> resultado = a.getId().compareTo(b.getId());
                    case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                    case "apellidos" -> resultado = a.getApellidos().compareTo(b.getApellidos());
                }

            } else if (dir == Dirrecion.DESC) {
                switch (campo) {
                    case "id" -> resultado = b.getId().compareTo(a.getId());
                    case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                    case "apellidos" -> resultado = b.getApellidos().compareTo(a.getApellidos());
                }
            }
            return resultado;
        });

        return dataSource;

    }
}

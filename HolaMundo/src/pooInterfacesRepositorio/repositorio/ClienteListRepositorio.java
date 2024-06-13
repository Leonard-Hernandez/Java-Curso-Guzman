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

                if (cli.getId().equals(id)) {
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public List<Cliente> listar(String campo, Dirrecion dir) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

}

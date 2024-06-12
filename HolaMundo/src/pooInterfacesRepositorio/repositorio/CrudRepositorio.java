package pooInterfacesRepositorio.repositorio;

import java.util.List;

import pooInterfacesRepositorio.modelo.Cliente;

public interface CrudRepositorio {

    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);

}

package pooInterfacesRepositorio.repositorio;

import java.util.List;

import pooInterfacesRepositorio.modelo.Cliente;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Dirrecion dir);

}

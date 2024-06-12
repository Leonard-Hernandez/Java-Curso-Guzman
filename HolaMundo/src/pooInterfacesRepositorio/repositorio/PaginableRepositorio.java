package pooInterfacesRepositorio.repositorio;

import java.util.List;

import pooInterfacesRepositorio.modelo.Cliente;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta);

}

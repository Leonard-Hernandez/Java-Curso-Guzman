package pooInterfacesRepositorio.repositorio;

import java.util.List;

public interface OrdenableRepositorio<T> {

    List<T> listar(String campo, Dirrecion dir);

}

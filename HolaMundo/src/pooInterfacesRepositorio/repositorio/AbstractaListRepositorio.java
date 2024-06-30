package pooInterfacesRepositorio.repositorio;

import java.util.ArrayList;

import java.util.List;

import pooInterfacesRepositorio.modelo.BaseEntity;
import pooInterfacesRepositorio.repositorio.excepciones.*;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    public T porId(Integer id) throws LecturaAccesoDatoException {
        T c = null;

        for (T cli : dataSource) {
            if(id == null || id <= 0){
                throw new LecturaAccesoDatoException("Id invalido tiene que ser mayor a 0");
            }

            if (cli.getId() != null && cli.getId().equals(id)) {
                c = cli;
                break;
            }

        }
        if(c == null){
            throw new LecturaAccesoDatoException("No existe el registro con id =" + id);
        }
        return c;
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatosException {
        if(t == null){
            throw new EscrituraAccesoDatosException("Error al insertar un objeto null");
        }
        this.dataSource.add(t);
        if (this.dataSource.contains(t)) {
            throw new RegistroDuplicadoAccesoDatosException("Este objeto ya existe");           
        }
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}

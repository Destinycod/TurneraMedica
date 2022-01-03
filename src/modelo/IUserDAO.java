package modelo;

import excepciones.DAOException;
import java.util.List;
public interface IUserDAO<T> {
    public void aniadir(T user) throws DAOException;
    public void eliminar(int id) throws DAOException;
    public void modificar(T user) throws DAOException;
    public List<T> listar() throws DAOException;
    public T buscar(int id) throws DAOException;

}

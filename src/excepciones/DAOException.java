package excepciones;

public class DAOException extends Exception{
    public DAOException(String mensaje_dao) {
        super(mensaje_dao);
    }
}

package Service;

import Entidades.Paciente;
import excepciones.DAOException;
import modelo.PacienteDAO;

import java.util.List;

public class PacienteService {
    private PacienteDAO pacienteDAO;

    public PacienteService(){
        pacienteDAO= new PacienteDAO();
    }

    public void aniadir(Paciente paciente) throws DAOException {
        pacienteDAO.aniadir(paciente);
    }

    public void eliminar(int id) throws DAOException{
        pacienteDAO.eliminar(id);
    }

    public void modificar(Paciente paciente) throws DAOException{
        pacienteDAO.modificar(paciente);
    }

    public List<Paciente> listar() throws DAOException{
        return pacienteDAO.listar();
    }

    public Paciente buscar(int id) throws DAOException{
        return pacienteDAO.buscar(id);
    }
}

package modelo;

import Entidades.Paciente;
import Entidades.Persona;
import Interfaz.CamposAltaPanel;
import excepciones.DAOException;

import java.sql.*;
import java.util.*;

//REVISAR EXCEPCIONES

public class PacienteDAO extends Persona implements IUserDAO<Paciente>{

    public void aniadir(Paciente paciente) throws DAOException {
        Connection connection = null;

        PreparedStatement sentenciaPS;
        try {
            connection = AdministradorConnection.connect();

            sentenciaPS = connection.prepareStatement("INSERT INTO PACIENTE (ID, DNI, NOMBRE, APELLIDO, OBRA_SOCIAL) VALUES(?,?,?,?,?)");
            sentenciaPS.setInt(1,paciente.getId());
            sentenciaPS.setInt(2,paciente.getDni());
            sentenciaPS.setString(3,paciente.getNombre());
            sentenciaPS.setString(4,paciente.getApellido());
            sentenciaPS.setString(5,paciente.getObraSocial());

            int registrosModificados = sentenciaPS.executeUpdate();
            System.out.println("Registros agregados: " + registrosModificados);

            sentenciaPS.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new DAOException("SQL Project DAO Error");

        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                throw new DAOException("SQL Project DAO Error on close");
            }
        }
    }

    public void eliminar(int id) throws DAOException {
        Connection connection = null;
        PreparedStatement sentenciaPS = null;
        try {
            connection = AdministradorConnection.connect();

            sentenciaPS = connection.prepareStatement("DELETE FROM PACIENTE WHERE ID=?");
            sentenciaPS.setInt(1,id);

            int registrosModificados = sentenciaPS.executeUpdate();
            System.out.println("Registros borrados: " + registrosModificados);

            sentenciaPS.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new DAOException("SQL Project DAO Error");

        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                throw new DAOException("SQL Project DAO Error on close");
            }
        }
    }

    public void modificar(Paciente paciente) throws DAOException{
        Connection connection = null;
        PreparedStatement sentenciaPS = null;
        try {
            connection = AdministradorConnection.connect();

            sentenciaPS = connection.prepareStatement("UPDATE PACIENTE SET DNI=?, NOMBRE=?, APELLIDO=?, OBRA_SOCIAL=? WHERE ID=?");
            sentenciaPS.setInt(1,paciente.getDni());
            sentenciaPS.setString(2, paciente.getNombre());
            sentenciaPS.setString(3,paciente.getApellido());
            sentenciaPS.setString(4,paciente.getObraSocial());
            sentenciaPS.setInt(5, paciente.getId());

            int registrosModificados = sentenciaPS.executeUpdate();
            System.out.println("Registros modificados: " + registrosModificados);

            sentenciaPS.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                throw new DAOException("Excepción SQL, DAO Error");
            } catch (DAOException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                try {
                    throw new DAOException("No se puede cerrar SQL, DAO Error");
                } catch (DAOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public List<Paciente> listar() throws DAOException{
        List<Paciente> listaPaciente = new ArrayList<>();
        Connection connection = null;
        Statement sentencia = null;

        try {
            connection = AdministradorConnection.connect();
            sentencia = connection.createStatement();
            ResultSet resultados =  sentencia.executeQuery("SELECT * FROM PACIENTES");

            while(resultados.next()){//ID, DNI, NOMBRE, APELLIDO, OBRA_SOCIAL
                Paciente paciente = new Paciente(resultados.getInt("ID"), resultados.getInt("DNI"), resultados.getString("NOMBRE"), resultados.getString("APELLIDO"), resultados.getString("OBRA_SOCIAL"));
                paciente.setId(resultados.getInt("ID"));
                paciente.setDni(resultados.getInt("DNI"));
                paciente.setNombre(resultados.getString("NOMBRE"));
                paciente.setApellido(resultados.getString("APELLIDO"));
                paciente.setObraSocial(resultados.getString("OBRA_SOCIAL"));
                listaPaciente.add(paciente);
            }
            resultados.close();
            sentencia.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new DAOException("SQL Project DAO Error");
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                throw new DAOException("SQL Project DAO Error on close");
            }
        }
        return listaPaciente;
    }

    public Paciente buscar(int id) throws DAOException{
        Paciente paciente = null;
        Connection connection = null;
        Statement sentencia = null;

        try {
            connection = AdministradorConnection.connect();
            sentencia = connection.createStatement();
            ResultSet resultados =  sentencia.executeQuery("SELECT * FROM PACIENTE");

            while(resultados.next()){
                paciente = new Paciente(resultados.getInt("ID"), resultados.getInt("DNI"), resultados.getString("NOMBRE"), resultados.getString("APELLIDO"), resultados.getString("OBRA_SOCIAL"));
                paciente.setId(resultados.getInt("ID"));
                paciente.setDni(resultados.getInt("DNI"));
                paciente.setNombre(resultados.getString("NOMBRE"));
                paciente.setApellido(resultados.getString("APELLIDO"));
                paciente.setObraSocial(resultados.getString("OBRA_SOCIAL"));

            }
            resultados.close();
            sentencia.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new DAOException("SQL Project DAO Error");
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                throw new DAOException("SQL Project DAO Error on close");
            }
        }
        return paciente;
    }
}

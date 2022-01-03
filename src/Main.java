import Entidades.Paciente;
import Interfaz.AdministradorPaneles;
import Service.PacienteService;
import excepciones.DAOException;

public class Main {

    private AdministradorPaneles manager;

    public static void main (String []args){
        /*
        //PROBANDO
        Paciente paciente1 = new Paciente();
        paciente1.setId(002);
        paciente1.setDni(62158562);
        paciente1.setNombre("Juan");
        paciente1.setApellido("Rob");
        paciente1.setObraSocial("MEDICUS");

        PacienteService pacienteService = new PacienteService();
        try {
            pacienteService.aniadir(paciente1);
        } catch (DAOException e) {
            e.printStackTrace();
        }*/

            Main ppal = new Main();
            ppal.iniciarManager();
        }

        public void iniciarManager() {
            manager = new AdministradorPaneles();
            manager.armarAdministrador();

            manager.mostrarPrincipalPanel();
        }



}

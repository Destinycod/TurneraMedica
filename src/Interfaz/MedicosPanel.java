package Interfaz;
//REVISAR CAMBIO DE NOMBRE BOTONERA

public class MedicosPanel extends AbstractPantallaPanel {

    public MedicosPanel(AdministradorPaneles panelManager) {
        super(panelManager);
    }

    public void setCamposPanel() {
        this.camposPanel = new CampoDatosMedicosPanel(panelManager);
    }
    public void setBotoneraPanel() {
        this.botonesPanel = new BotoneraConsultaPacientePanel(panelManager);
    }

    public void ejecutarAccionOk() {

    }

    public void ejecutarAccionCancel() {

    }

    /*public void llenarDatos(Usuario u) {
        CamposUsuarioPanel camposUsuarioPanel = (CamposUsuarioPanel) this.camposPanel;
        camposUsuarioPanel.getApellidoTxt().setText(u.getNombre());
        camposUsuarioPanel.getApellidoTxt().setText(String.valueOf(u.getDni()));
    }*/
}

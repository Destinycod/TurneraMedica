package Interfaz;

public class PacientesPanel extends AbstractPantallaPanel {

    public PacientesPanel(AdministradorPaneles panelManager) {
        super(panelManager);
    }

    public void setCamposPanel() {
        this.camposPanel = new CamposDatosPacientePanel(panelManager);
    }

    public void setBotoneraPanel() {
        this.botonesPanel = new BotoneraConsultaPacientePanel(panelManager);
    }

    public void ejecutarAccionOk() {

    }

    public void ejecutarAccionCancel() {

    }

    //this.add(cajaVertical, BorderLayout.CENTER);

    /*protected AdministradorPaneles manager;

    PacientesPanel(AdministradorPaneles manager){
        this.manager = manager;
        armarPacientesPanel();
    }

    private void armarPacientesPanel(){
        Box cajaVertical=Box.createVerticalBox();
        //cajaVertical.add();

        //Agrego Caja Vertical al frame
        this.add(cajaVertical, BorderLayout.CENTER);
    }*/
}

package Interfaz;

public class AltaPanel extends AbstractPantallaPanel {

    public AltaPanel(AdministradorPaneles panelManager) {
        super(panelManager);
    }

    public void setCamposPanel() {
        this.camposPanel = new CamposAltaPanel(panelManager);
    }

    public void setBotoneraPanel() {
        this.botonesPanel = new BotoneraAgregar(panelManager);
    }

    public void ejecutarAccionOk() {

    }

    public void ejecutarAccionCancel() {

    }
}

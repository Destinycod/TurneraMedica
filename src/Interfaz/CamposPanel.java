package Interfaz;

import javax.swing.*;

public abstract class CamposPanel extends JPanel {
    private AdministradorPaneles manager;

    public CamposPanel(AdministradorPaneles manager) {
        this.manager = manager;
        armarFormulario();
    }

    public abstract void armarFormulario();

}

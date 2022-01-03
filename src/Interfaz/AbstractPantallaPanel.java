package Interfaz;

//HACER BOTONERA

import javax.swing.*;
import java.awt.*;

public abstract class AbstractPantallaPanel extends JPanel {

    protected AdministradorPaneles panelManager;
    protected CamposPanel camposPanel;
    protected BotoneraPanel botonesPanel;
    //protected MenuBar menu;

    public AbstractPantallaPanel(AdministradorPaneles panelManager) {
        this.panelManager = panelManager;
        this.setCamposPanel();
        this.setBotoneraPanel();
        armarPantallaPanel();
    }

    public void armarPantallaPanel() {
        //this.menu=new MenuBar();
/*
        Box cajaVerticalContenedora = Box.createVerticalBox();
        //cajaVerticalContenedora.add(menu);
        cajaVerticalContenedora.add(camposPanel);
        cajaVerticalContenedora.add(botonesPanel);
        this.add(cajaVerticalContenedora, BorderLayout.CENTER);

        //this.add(camposPanel);
        //this.add(botonesPanel);
        */
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(camposPanel);
        this.add(botonesPanel);
    }

    /*private void setBotoneraPanel() {
        this.botonesPanel = new BotoneraPanel(this.panelManager);
    }*/

    public abstract void setBotoneraPanel();
    public abstract void setCamposPanel();

    public abstract void ejecutarAccionOk();
    public abstract void ejecutarAccionCancel();
}

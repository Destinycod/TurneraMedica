package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//BORRAR CLASE

public class BotoneraConsultaMedicoPanel extends BotoneraPanel{

    protected AdministradorPaneles panelManager;
    private JButton consultarTurnoBtn;
    private JButton volverBtn;

    public BotoneraConsultaMedicoPanel(AdministradorPaneles panelManager) {
        super();
        this.panelManager = panelManager;
    }

    public void armarBotoneraPanel() {
        Box cajaHorizontalBotones = Box.createHorizontalBox();
        this.volverBtn = new JButton("Volver");
        cajaHorizontalBotones.add(volverBtn);
        this.consultarTurnoBtn = new JButton("Turnos Programados");
        cajaHorizontalBotones.add(consultarTurnoBtn);

        this.volverBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelManager.mostrarPrincipalPanel();
            }
        });

        this.consultarTurnoBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //MOSTRAR TABLA
            }
        });

        this.add(cajaHorizontalBotones);
    }

    public JButton getConsultarTurnoBtn() {
        return consultarTurnoBtn;
    }

    public void setConsultarTurnoBtn(JButton consultarTurnoBtn) {
        this.consultarTurnoBtn = consultarTurnoBtn;
    }

    public JButton getVolverBtn() {
        return volverBtn;
    }

    public void setVolverBtn(JButton volverBtn) {
        this.volverBtn = volverBtn;
    }
}

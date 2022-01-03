package Interfaz;

import Entidades.Paciente;
import Service.PacienteService;
import excepciones.DAOException;
import Interfaz.CamposAltaPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoneraAgregar extends BotoneraPanel{
    protected AdministradorPaneles panelManager;
    private JButton agregarBtn;
    private JButton volverBtn;

    public BotoneraAgregar(AdministradorPaneles panelManager) {
        super();
        this.panelManager = panelManager;
    }

    public void armarBotoneraPanel() {
        Box cajaHorizontalBotones = Box.createHorizontalBox();
        this.volverBtn = new JButton("Volver");
        cajaHorizontalBotones.add(volverBtn);
        this.agregarBtn = new JButton("Agregar");
        cajaHorizontalBotones.add(agregarBtn);

        this.volverBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelManager.mostrarPrincipalPanel();
            }
        });

        this.agregarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                Integer id = Integer.parseInt(CamposAltaPanel.idInputWithLabel.getInput().getText());
                Integer dni = Integer.parseInt(CamposAltaPanel.dniInputWithLabel.getInput().getText());
                String nombre = CamposAltaPanel.nombreInputWithLabel.getInput().getText();
                String apellido = CamposAltaPanel.apellidoInputWithLabel.getInput().getText();
                String obraSocial = CamposAltaPanel.obraSocialInputWithLabel.getInput().getText();

                Paciente paciente  = new Paciente(id, dni, nombre, apellido, obraSocial);

                System.out.println(paciente);
                PacienteService pacienteService = new PacienteService();
                try {
                    pacienteService.aniadir(paciente);
                } catch (DAOException e) {
                    e.printStackTrace();
                }
            }
        });

        this.add(cajaHorizontalBotones);
    }

    public JButton getAgregarBtn() {
        return agregarBtn;
    }

    public void setAgregarBtn(JButton consultarTurnoBtn) {
        this.agregarBtn = consultarTurnoBtn;
    }

    public JButton getVolverBtn() {
        return volverBtn;
    }

    public void setVolverBtn(JButton volverBtn) {
        this.volverBtn = volverBtn;
    }
}

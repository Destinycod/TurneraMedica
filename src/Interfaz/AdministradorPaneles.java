package Interfaz;

import javax.swing.*;

public class AdministradorPaneles extends JFrame {
    private JFrame frame;
    private PacientesPanel panelPacientes;
    private MedicosPanel panelMedicos;
    private AltaPanel panelAlta;
    private VentanaPrincipal panelPrincipal;
    private LoginForm loginForm;

    public void armarAdministrador(){
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelPacientes = new PacientesPanel(this);
        panelMedicos = new MedicosPanel(this);
        panelAlta = new AltaPanel(this);
        panelPrincipal = new VentanaPrincipal(this);
        //loginForm = new LoginForm(this);
    }

    /*public void showFrame() {
        frame.setVisible(true);
    }*/

    public void mostrarPacientesPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panelPacientes);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
        frame.setTitle("Paciente");
        frame.setVisible(true);
    }

    public void mostrarMedicosPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panelMedicos);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
        frame.setTitle("Médico");
        frame.setVisible(true);
    }

    public void mostrarPrincipalPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panelPrincipal);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
        frame.setTitle("Bienvenido!");
        frame.setVisible(true);
    }

    public void mostrarAltaPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panelAlta);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
        frame.setTitle("Alta");
        frame.setVisible(true);
    }

    public void mostrarLoginPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(loginForm);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
        frame.setTitle("Inicie Sesión");
        frame.setVisible(true);
    }
}

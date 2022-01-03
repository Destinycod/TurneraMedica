package Interfaz;

import javax.swing.*;

public class AdministradorVentanas {

    private AdministradorVentanas windowManager;
    private LoginForm ventanaLoginForm;
    private VentanaPrincipal ventanaPrincipal;
    private VentanaPaciente ventanaPaciente;

    public void mostrarLoginForm(){
        ventanaLoginForm.setVisible(true);
    }

    public void mostrarVentanaPaciente(){
        ventanaPaciente.setVisible(true);
    }
}

    /*private JFrame frame;

    public void armarManager() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        //pantallaPacientesPanel = new VentanaPaciente(this);

    }
}

    /*public void showFrame() {
        frame.setVisible(true);
    }

    public void mostrarInicioPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(pantallaInicioPanel);
        frame.getContentPane().validate();//RE-dispongo los elementos segun el layout
        frame.getContentPane().repaint();//RE-pinto los elementos dispuestos en el paso anterior

    }
}*/

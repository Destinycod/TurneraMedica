package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JPanel {

    private AdministradorPaneles panelManager;
    private JButton medicosBtn;
    private JButton pacientesBtn;
    private JButton altaBtn;

    public VentanaPrincipal(AdministradorPaneles panelManager){
        this.panelManager=panelManager;
        panel();
    }

    private void panel(){
        setLayout(new FlowLayout());
        this.altaBtn = new JButton("Alta");
        add(altaBtn);
        this.medicosBtn = new JButton("Medico");
        add(medicosBtn);
        this.pacientesBtn = new JButton("Paciente");
        add(pacientesBtn);

        this.altaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelManager.mostrarAltaPanel();
            }
        });

        this.pacientesBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelManager.mostrarLoginPanel();
            }
        });

        this.medicosBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelManager.mostrarLoginPanel();
            }
        });
    }

}


/*public class MarcoLayout extends JFrame{

	public static void main(String[] args) {
		MarcoLayout marco = new MarcoLayout();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

	public MarcoLayout() {
		setTitle("Marco");
		setBounds(200,200,200,200);

		PanelLayoutIz lamina = new PanelLayoutIz();
		add(lamina, BorderLayout.CENTER);

		//PanelLayoutDer laminaDer = new PanelLayoutDer();
		//add(laminaDer, BorderLayout.EAST);

		PanelLayout2 lamina2 = new PanelLayout2();
		add(lamina2, BorderLayout.SOUTH);
	}

	class PanelLayoutIz extends JPanel{
		public PanelLayoutIz() {
			setLayout(new GridLayout(2,2,5,5));
			add(new JLabel("Nombre: "));
			add(new JLabel("Clara"));
			add(new JLabel("Fecha: "));
			add(new JLabel("20/12"));
		}
	}

	/*class PanelLayoutDer extends JPanel{
		public PanelLayoutDer() {
			setLayout(new FlowLayout(FlowLayout.RIGHT));
			add(new JLabel("Clara"));
		}
	}

class PanelLayout2 extends JPanel{
    public PanelLayout2() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JButton("Boton"));
        add(new JButton("Boton2"));
    }
}
}
*/
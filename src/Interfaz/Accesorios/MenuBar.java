package Interfaz.Accesorios;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    private JMenu datos;
    private JMenu agendarTurno;

    public MenuBar(){
        this.datos=new JMenu("Datos");
        this.agendarTurno=new JMenu("Agendar Turno");

        this.add(datos);
        this.add(agendarTurno);
    }

}

package Interfaz;

import Service.PacienteService;
import excepciones.DAOException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPaciente extends JFrame {
/*
    private VentanaPaciente marcoVentanaPaciente;
    private JLabel lbNombreP;
    private JTextField nombreP;
    private JLabel lbDniP;
    private JTextField dniP;
    private JLabel lbIDPaciente;
    private JTextField idPaciente;
    private JButton cancelarBtn;
    private JButton volverBtn;

    public VentanaPaciente(){
        setTitle("Bienvenido Paciente");
        panel();
    }

    private void panel(){

        //Seccion ID
        Box cajaHID=Box.createHorizontalBox();
        this.lbIDPaciente=new JLabel("ID");
        cajaHID.add(lbIDPaciente);
        cajaHID.add(Box.createHorizontalStrut(20));
        this.idPaciente=new JTextField(15);
        idPaciente.setMaximumSize(idPaciente.getPreferredSize());
        cajaHID.add(idPaciente);

        //Seccion Dni
        Box cajaHDni=Box.createHorizontalBox();
        this.lbDniP=new JLabel("DNI");
        cajaHDni.add(lbDniP);
        cajaHDni.add(Box.createHorizontalStrut(20));
        this.dniP=new JTextField(15);
        dniP.setMaximumSize(dniP.getPreferredSize());
        cajaHDni.add(dniP);

        //Seccion nombre
        Box cajaHNombre=Box.createHorizontalBox();
        this.lbNombreP=new JLabel("Nombre");
        cajaHNombre.add(lbNombreP);
        cajaHNombre.add(Box.createHorizontalStrut(20));
        this.nombreP=new JTextField(15);
        nombreP.setMaximumSize(nombreP.getPreferredSize());
        cajaHNombre.add(nombreP);

        //Seccion Fecha de Nacimiento
        /*Box cajaHFecha=Box.createHorizontalBox();
        this.lbFechaNacimientoP=new JLabel("Fecha Nacimiento");
        cajaHDni.add(lbFechaNacimientoP);
        cajaHDni.add(Box.createHorizontalStrut(20));
        this.fechaNacimientoP=new JTextField(15);
        fechaNacimientoP.setMaximumSize(fechaNacimientoP.getPreferredSize());
        cajaHDni.add(fechaNacimientoP);

        /Caja Vertical contenedora de Datos
        Box cajaVerticalDatos=Box.createVerticalBox();
        cajaVerticalDatos.add(cajaHNombre);
        cajaVerticalDatos.add(cajaHDni);
        cajaVerticalDatos.add(cajaHID);*/

        //Caja Horizontal contenedora de datos y agenda
    /*
        Box cajaHorizontalDyA=Box.createHorizontalBox();
        cajaHorizontalDyA.add(cajaVerticalDatos);

        //Caja Horizontal que contiene la botonera
        Box cajaHorizontalBotonera=Box.createHorizontalBox();

        this.volverBtn=new JButton("Volver");
        cajaHorizontalBotonera.add(volverBtn);
        cajaHorizontalBotonera.add(Box.createHorizontalStrut(20));
        this.cancelarBtn=new JButton("Cancelar");
        cajaHorizontalBotonera.add(cancelarBtn);

        //Caja vertical Contenedora
        Box cajaVertical=Box.createVerticalBox();
        cajaVertical.add(cajaHorizontalDyA);
        cajaVertical.add(cajaHorizontalBotonera);

        //Agrego Caja Vertical al frame
        this.add(cajaVertical,BorderLayout.CENTER);

        this.volverBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PacienteService user = new PacienteService();
                try {
                    user.buscar(Integer.parseInt(idPaciente.getText()));
                    //nombreP.setText(getNombreP());
                } catch (DAOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main (String[] args){
        VentanaPaciente marcoVentanaPaciente = new VentanaPaciente();
        marcoVentanaPaciente.setBounds(100, 100, 500, 500);
        marcoVentanaPaciente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoVentanaPaciente.setVisible(true);
    }

    public VentanaPaciente getMarcoVentanaPaciente() {
        return marcoVentanaPaciente;
    }

    public void setMarcoVentanaPaciente(VentanaPaciente marcoVentanaPaciente) {
        this.marcoVentanaPaciente = marcoVentanaPaciente;
    }

    /*public JLabel getLbNombreP() {
        return lbNombreP;
    }

    public void setLbNombreP(JLabel lbNombreP) {
        this.lbNombreP = lbNombreP;
    }*

    public JTextField getNombreP() {
        return nombreP;
    }

    public void setNombreP(JTextField nombreP) {
        this.nombreP = nombreP;
    }

    /*public JLabel getLbDniP() {
        return lbDniP;
    }

    public void setLbDniP(JLabel lbDniP) {
        this.lbDniP = lbDniP;
    }*

    public JTextField getDniP() {
        return dniP;
    }

    public void setDniP(JTextField dniP) {
        this.dniP = dniP;
    }
    */
}

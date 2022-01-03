package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    private LoginForm marcoVentanaLogin;
    private AdministradorPaneles manager;
    private JLabel lbUser;
    private JTextField userField;
    private JLabel lbPassword;
    private JTextField passwordField;
    private JButton aceptarBtn;
    private JButton volverBtn;

    public LoginForm(){
        setTitle("Bienvenido Paciente");
        panel();
    }

    private void panel(){

        //Seccion Dni
        Box cajaHUser=Box.createHorizontalBox();
        this.lbUser=new JLabel("Usuario");
        cajaHUser.add(lbUser);
        cajaHUser.add(Box.createHorizontalStrut(20));
        this.userField=new JTextField(15);
        userField.setMaximumSize(userField.getPreferredSize());
        cajaHUser.add(userField);

        //Seccion nombre
        Box cajaHPassword=Box.createHorizontalBox();
        this.lbPassword=new JLabel("Nombre");
        cajaHPassword.add(lbPassword);
        cajaHPassword.add(Box.createHorizontalStrut(20));
        this.passwordField=new JTextField(15);
        passwordField.setMaximumSize(passwordField.getPreferredSize());
        cajaHPassword.add(passwordField);

        //Caja Vertical contenedora de Datos
        Box cajaVerticalDatos=Box.createVerticalBox();
        cajaVerticalDatos.add(cajaHUser);
        cajaVerticalDatos.add(cajaHPassword);

        //Caja Horizontal que contiene la botonera
        Box cajaHorizontalBotonera=Box.createHorizontalBox();

        this.volverBtn=new JButton("Volver");
        cajaHorizontalBotonera.add(volverBtn);
        cajaHorizontalBotonera.add(Box.createHorizontalStrut(20));
        this.aceptarBtn=new JButton("Aceptar");
        cajaHorizontalBotonera.add(aceptarBtn);

        this.aceptarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(passwordField == getPasswordField()){
                    if(userField == getUserField()){
                        manager.mostrarPacientesPanel();
                    }
                }
            }
        });

        //Caja vertical Contenedora
        Box cajaVertical=Box.createVerticalBox();
        cajaVertical.add(cajaVerticalDatos);
        cajaVertical.add(cajaHorizontalBotonera);

        //Agrego Caja Vertical al frame
        this.add(cajaVertical, BorderLayout.CENTER);
    }

    public JLabel getLbUser() {
        return lbUser;
    }

    public void setLbUser(JLabel lbUser) {
        this.lbUser = lbUser;
    }

    public JTextField getUserField() {
        return userField;
    }

    public void setUserField(JTextField userField) {
        this.userField = userField;
    }

    public JLabel getLbPassword() {
        return lbPassword;
    }

    public void setLbPassword(JLabel lbPassword) {
        this.lbPassword = lbPassword;
    }

    public JTextField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JTextField passwordField) {
        this.passwordField = passwordField;
    }

    public static void main (String[] args){
        LoginForm marcoVentanaLogin = new LoginForm();
        marcoVentanaLogin.setBounds(100, 100, 500, 500);
        marcoVentanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoVentanaLogin.setVisible(true);
    }

}

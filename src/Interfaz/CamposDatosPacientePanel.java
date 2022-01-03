package Interfaz;

import javax.swing.*;
import java.awt.*;

public class CamposDatosPacientePanel extends CamposPanel{

    private JTextField txtID;
    private JLabel lbID;
    private JTextField txtNombre;
    private JLabel lbNombre;
    private JTextField txtApellido;
    private JLabel lbApellido;
    private JTextField txtDNI;
    private JLabel lbDNI;

    public CamposDatosPacientePanel(AdministradorPaneles manager){
        super(manager);
    }

    public void armarFormulario() {

        //Seccion ID
        Box cajaHID=Box.createHorizontalBox();
        this.lbID=new JLabel("ID");
        cajaHID.add(lbID);
        cajaHID.add(Box.createHorizontalStrut(30));
        this.txtID=new JTextField(15);
        txtID.setMaximumSize(txtID.getPreferredSize());
        cajaHID.add(txtID);

        //Seccion nombre
        Box cajaHNombre=Box.createHorizontalBox();
        this.lbNombre=new JLabel("Nombre");
        cajaHNombre.add(lbNombre);
        cajaHNombre.add(Box.createHorizontalStrut(20));
        this.txtNombre=new JTextField(15);
        txtNombre.setMaximumSize(txtNombre.getPreferredSize());
        cajaHNombre.add(txtNombre);

        //Seccion apellido
        Box cajaHApellido=Box.createHorizontalBox();
        this.lbApellido=new JLabel("Apellido");
        cajaHApellido.add(lbApellido);
        cajaHApellido.add(Box.createHorizontalStrut(20));
        this.txtApellido=new JTextField(15);
        txtApellido.setMaximumSize(txtApellido.getPreferredSize());
        cajaHApellido.add(txtApellido);

        //Seccion dni
        Box cajaHDNI=Box.createHorizontalBox();
        this.lbDNI=new JLabel("DNI");
        cajaHDNI.add(lbDNI);
        cajaHDNI.add(Box.createHorizontalStrut(30));
        this.txtDNI=new JTextField(15);
        txtDNI.setMaximumSize(txtDNI.getPreferredSize());
        cajaHDNI.add(txtDNI);

        Box cajaVerticalDatos=Box.createVerticalBox();
        cajaVerticalDatos.add(cajaHID);
        cajaVerticalDatos.add(cajaHNombre);
        cajaVerticalDatos.add(cajaHApellido);
        cajaVerticalDatos.add(cajaHDNI);

        this.add(cajaVerticalDatos);
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JLabel getLbID() {
        return lbID;
    }

    public void setLbID(JLabel lbID) {
        this.lbID = lbID;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JLabel getLbNombre() {
        return lbNombre;
    }

    public void setLbNombre(JLabel lbNombre) {
        this.lbNombre = lbNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JLabel getLbApellido() {
        return lbApellido;
    }

    public void setLbApellido(JLabel lbApellido) {
        this.lbApellido = lbApellido;
    }

    public JTextField getTxtDNI() {
        return txtDNI;
    }

    public void setTxtDNI(JTextField txtDNI) {
        this.txtDNI = txtDNI;
    }

    public JLabel getLbDNI() {
        return lbDNI;
    }

    public void setLbDNI(JLabel lbDNI) {
        this.lbDNI = lbDNI;
    }
}

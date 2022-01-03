package Interfaz;


import Interfaz.Accesorios.InputWithLabel;

import javax.swing.*;

/*
me faltan los eventos para dar de alta:

PacienteService pacienteService = new PacienteService();
        try {
            pacienteService.aniadir(paciente1);
        } catch (DAOException e) {
            e.printStackTrace();
        }

debería estar en el evento del boton de agregar pciente

 */

public class CamposAltaPanel extends CamposPanel{
    public static InputWithLabel idInputWithLabel;
    public static InputWithLabel dniInputWithLabel;
    public static InputWithLabel nombreInputWithLabel;
    public static InputWithLabel apellidoInputWithLabel;
    public static InputWithLabel obraSocialInputWithLabel;

    public CamposAltaPanel(AdministradorPaneles manager){
        super(manager);
    }

    public void armarFormulario() {

        //Seccion ID
        Box cajaHID=Box.createHorizontalBox();
        /*this.lbID=new JLabel("ID");
        cajaHID.add(lbID);
        cajaHID.add(Box.createHorizontalStrut(30));
        lbID=new ImputWithLabel("ID");
        txtID.setMaximumSize(txtID.getPreferredSize());
        txtID.setText(Integer.toString(getTxtID()));
        cajaHID.add(txtID);*/

        this.idInputWithLabel = new InputWithLabel("ID");
        cajaHID.add(idInputWithLabel);

        //Seccion nombre
        Box cajaHNombre=Box.createHorizontalBox();
        this.nombreInputWithLabel = new InputWithLabel("NOMBRE");
        cajaHNombre.add(nombreInputWithLabel);

        //Seccion apellido
        Box cajaHApellido=Box.createHorizontalBox();
        this.apellidoInputWithLabel = new InputWithLabel("APELLIDO");
        cajaHApellido.add(apellidoInputWithLabel);

        //Seccion dni
        Box cajaHDNI=Box.createHorizontalBox();
        this.dniInputWithLabel = new InputWithLabel("DNI");
        cajaHDNI.add(dniInputWithLabel);

        //Seccion Obra Social
        Box cajaHObraSocial=Box.createHorizontalBox();
        this.obraSocialInputWithLabel = new InputWithLabel("OBRA SOCIAL");
        cajaHDNI.add(obraSocialInputWithLabel);

        Box cajaVerticalDatos=Box.createVerticalBox();
        cajaVerticalDatos.add(cajaHID);
        cajaVerticalDatos.add(cajaHDNI);
        cajaVerticalDatos.add(cajaHNombre);
        cajaVerticalDatos.add(cajaHApellido);
        cajaVerticalDatos.add(cajaHObraSocial);

        this.add(cajaVerticalDatos);
    }

}

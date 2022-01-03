package Entidades;

import java.util.Objects;

public class Medico extends Persona{

    private int id;
    private double precioPorConsulta;
    private String especialidad;
    private String obraSocial;

    public Medico(){
    }

    public Medico(String nombre, String apellido, int dni, int id, String especialidad, double precioPorConsulta, String obraSocial){
        super(nombre, apellido, dni);
        this.id = id;
        this.especialidad=especialidad;
        this.precioPorConsulta=precioPorConsulta;
        this.obraSocial = obraSocial;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioPorConsulta() {  return precioPorConsulta;   }

    public void setPrecioPorConsulta(double precioPorConsulta) {
        this.precioPorConsulta = precioPorConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
}

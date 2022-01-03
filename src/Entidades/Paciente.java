package Entidades;
import java.util.Objects;

public class Paciente extends Persona{

    private String obraSocial;
    private int id;

    public Paciente(){
    }

    public Paciente(int id, int dni, String nombre, String apellido,  String obraSocial){
        super(nombre,apellido,dni);
        this.obraSocial = obraSocial;
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(id, paciente.id);
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

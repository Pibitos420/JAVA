package Clases;

public class Catedra {
    private int codigo;
    private String denominacion;

    //private ArrayList<Clases.Alumno> alumnos;
    //private ArrayList<Clases.Nota> notas;

    public Catedra(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }


    @Override
    public String toString() {
        return "Clases.Catedra{" + "codigo=" + codigo + ", denominacion=" + denominacion + '}';
    }
}

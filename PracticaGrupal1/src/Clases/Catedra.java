package Clases;

import java.util.ArrayList;

public class Catedra {
    private int codigo;
    private String denominacion;

    private ArrayList<Clases.Alumno> alumnos;
    //private ArrayList<Clases.Nota> notas;


    public Catedra(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.alumnos = new ArrayList<Alumno>();
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

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno alumnos) {
        this.alumnos.add(alumnos);
    }

    public Clases.Alumno mejorAlumnoCatedra(){
        Double mejorPromedio = null;
        Clases.Alumno mejorAlumno = null;
        Double promedio;
        for (Clases.Alumno alumno : alumnos) {
            promedio = alumno.promedioNotas(codigo);
            if (mejorPromedio == null || promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorAlumno = alumno;
            }
        }
        return mejorAlumno;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Clases.Catedra{" + "codigo=" + codigo + ", denominacion=" + denominacion + '}';
    }
}

package Clases;

import java.util.ArrayList;

public class DivisionCurso {
    private int codigo;
    private int anio;
    private int division;

    private ArrayList<Catedra> catedras;
    private ArrayList<Escuela> escuelas;

    public DivisionCurso(int codigo, int anio, int division) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
        this.catedras = new ArrayList<>();
        this.escuelas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public ArrayList<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(ArrayList<Catedra> catedras) {
        this.catedras = catedras;
    }

    public ArrayList<Escuela> getEscuelas() {
        return escuelas;
    }

    public void setEscuelas(ArrayList<Escuela> escuelas) {
        this.escuelas = escuelas;
    }


    @Override
    public String toString() {
        return "Clases.DivisionCurso{" + "codigo=" + codigo + ", anio=" + anio + ", division=" + division + '}';
    }
}
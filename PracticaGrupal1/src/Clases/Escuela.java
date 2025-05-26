package Clases;

import java.util.ArrayList;

public class Escuela {
    private int numero;
    private String denominacion;

    private ArrayList<DivisionCurso> division;


    public Escuela(int numero, String denominacion) {
        this.numero = numero;
        this.denominacion = denominacion;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }


    @Override
    public String toString() {
        return "Clases.Escuela{" + "numero=" + numero + ", denominacion=" + denominacion + '}';
    }
}
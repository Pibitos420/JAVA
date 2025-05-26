package Clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DivisionCurso {
    private int codigo;
    private int anio;
    private int division;

    private ArrayList<Catedra> catedras;


    public DivisionCurso(int codigo, int anio, int division) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
        this.catedras = new ArrayList<>();
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

    public void agregarCatedra(Catedra catedras) {
        this.catedras.add(catedras);
    }

    public Alumno mejorAlumnoDivisionCurso() {
        Set<Alumno> alumnosUnicos = new HashSet<>();

        // 1. Juntar todos los alumnos únicos de todas las cátedras
        for (Catedra catedra : this.catedras) {
            alumnosUnicos.addAll(catedra.getAlumnos());
        }

        Alumno mejorAlumno = null;
        double mejorPromedio = -1;

        for (Alumno alumno : alumnosUnicos) {
            // Juntar TODAS las notas del alumno EN ESTA division
            ArrayList<Nota> notasDivision = new ArrayList<>();

            for (Catedra catedra : this.catedras) {
                for (Nota nota : alumno.getNotas()) {
                    if (nota.getCatedra().equals(catedra) && !nota.getEsRecuperatorio()) {
                        notasDivision.add(nota);
                    }
                }
            }

            // Chequear la cantidad de notas válidas
            if (notasDivision.size() >= 5) {
                double suma = 0;
                for (Nota nota : notasDivision) {
                    suma += nota.getValor();
                }
                double promedio = suma / notasDivision.size();

                if (promedio > mejorPromedio) {
                    mejorPromedio = promedio;
                    mejorAlumno = alumno;
                }
            }
        }
        return mejorAlumno;
    }


    @Override
    public String toString() {
        return "Clases.DivisionCurso{" + "codigo=" + codigo + ", anio=" + anio + ", division=" + division + ", catedras=" + catedras + '}';
    }
}
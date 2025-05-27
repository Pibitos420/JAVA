package Clases;

import java.util.ArrayList;
import java.util.Date;

public class Alumno {
    private long legajo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    private ArrayList<Nota> notas;
    //private Clases.Catedra catedra;

    public Alumno(long legajo, String nombre, String apellido, Date fechaNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.notas = new ArrayList<>();
    }

    public boolean nuncaDesaprobo() {
        for (Nota nota : this.notas) {
            if (!nota.getEsRecuperatorio() && nota.getValor() != null && nota.getValor() < 6.0) {
                return false;
            }
        }
        return true;
    }

    public double promedioNotasGeneral() {
        double suma = 0.0;
        int count = 0;
        for (Nota nota : this.notas) {
            if (!nota.getEsRecuperatorio() && nota.getValor() != null) {
                suma += nota.getValor();
                count++;
            }
        }
        return count > 0 ? suma / count : 0.0;
    }



    public Double promedioNotas(Integer codigoCatedra){
        ArrayList<Double> notasCatedra = new ArrayList<>();
        Double suma = 0.0;

        if (codigoCatedra != null) {
            for (Clases.Nota nota : notas) {
                if (nota.getCatedra().getCodigo() == codigoCatedra) {
                    suma += nota.getValor();
                    notasCatedra.add(nota.getValor());
                }
            }
        }
        else{
            for (Clases.Nota nota : notas) {
                suma += nota.getValor();
                notasCatedra.add(nota.getValor());
            }
        }

        return  suma / notasCatedra.size();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }


    public Nota mejorNota(Integer codigoCatedra) {
        Nota mejorNota = null;
        for (Nota nota : this.notas) {
            // Filtrar por recuperatorio
            if (nota.getEsRecuperatorio()) {
                continue;
            }
            // Filtrar por cátedra si corresponde
            if (codigoCatedra != null && (nota.getCatedra() == null || nota.getCatedra().getCodigo() != codigoCatedra)) {
                continue;
            }
            // Comparar valores de nota
            if (mejorNota == null || (nota.getValor() != null && nota.getValor() > mejorNota.getValor())) {
                mejorNota = nota;
            }
        }
        return mejorNota;
    }


    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }


    @Override
    public String toString() {
        return "Clases.Alumno{" + "legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}

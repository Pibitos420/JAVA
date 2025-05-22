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

    public ArrayList<DivisionCurso> getDivision() {
        return division;
    }

    public void setDivision(ArrayList<DivisionCurso> division) {
        this.division = division;
    }


    public void addDivision(DivisionCurso division){
        this.division.add(division);
    }

    //Codifique en la clase Escuela un método denominado
    //“public Alumno getMejorAlumnoEscuela(int
    //anioNacimientoAlumno)” que retorne el mejor alumno de la escuela,
    //cuya fecha de nacimiento sea de un año determinado y que nunca hayan
    //desaprobado exámenes.

    public Alumno getMejorAlumno(int anioNacimiento){
        for (DivisionCurso division : division) {
            if(division.getAnio() == anioNacimiento){
                return division.mejorAlumnoDivision();
            }
        }
        return null;
    }

    //    public ArrayList<Alumno> getMejoresAlumnos(int anioNacimiento){
    //
    //    };

    @Override
    public String toString() {
        return "Escuela{" + "numero=" + numero + ", denominacion=" + denominacion + '}';
    }
}
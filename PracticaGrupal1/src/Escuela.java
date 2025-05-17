import java.util.ArrayList;

public class Escuela {
    private int numero;
    private String denominacion;
    private ArrayList<DivisionCurso> division;

    public Escuela(int numero, String denominacion,ArrayList<DivisionCurso> division) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.division=division;
    }
    @Override
    public String toString() {
        return "Escuela{" + "numero=" + numero + ", denominacion=" + denominacion + '}';
    }
    public int getNumero() {
        return numero;
    }
    public String getDenominacion() {
        return denominacion;
    }

    public ArrayList<DivisionCurso> getDivision() {
        return division;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public void setDivision(ArrayList<DivisionCurso> division) {
        this.division = division;
    }
    public void addDivision(DivisionCurso division){
        this.division.add(division);
    }


}

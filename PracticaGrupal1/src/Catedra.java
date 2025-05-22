import java.util.ArrayList;

public class Catedra {
    private int codigo;
    private String denominacion;

    private ArrayList<Alumno> alumnos;
    private ArrayList<Nota> notas;
    //private DivisionCurso division;

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

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public DivisionCurso getDivision() {
        return division;
    }

    public void setDivision(DivisionCurso division) {
        this.division = division;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void addNota(Nota nota){
        this.notas.add(nota);
    }

    public Alumno mejorAlumnoCatedra(){
        Double mejorPromedio = null;
        Alumno mejorAlumno = null;
        Double promedio;
        for (Alumno alumno : alumnos) {
            promedio = alumno.promedioNotas(codigo);
            if (mejorPromedio == null || promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorAlumno = alumno;
            }
        }
        return mejorAlumno;
    }

    @Override
    public String toString() {
        return "Catedra{" + "codigo=" + codigo + ", denominacion=" + denominacion + '}';
    }
}

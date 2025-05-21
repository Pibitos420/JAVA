import java.util.ArrayList;

public class Catedra {
    private int codigo;
    private String denominacion;

    private ArrayList<Alumno> alumnos;
    private DivisionCurso division;
    private ArrayList<Nota> notas;


    public Catedra(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public DivisionCurso getDivision() {
        return division;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public void setDivision(DivisionCurso division) {
        this.division = division;
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

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

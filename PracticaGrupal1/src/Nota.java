import java.util.Date;

public class Nota {
    private int id;
    private Double valor;
    private Date fechaExamen;
    private boolean esRecuperatorio;

    private Alumno alumno;
    private Catedra catedra;


    public Nota(int id, Double valor, Date fechaExamen, boolean esRecuperatorio) {
        this.id = id;
        this.valor = valor;
        this.fechaExamen = fechaExamen;
        this.esRecuperatorio = esRecuperatorio;
    }

    public int getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public Date getFechaExamen() {
        return fechaExamen;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public boolean getEsRecuperatorio() {
        return esRecuperatorio;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setFechaExamen(Date fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public void setEsRecuperatorio(boolean esRecuperatorio) {
        this.esRecuperatorio = esRecuperatorio;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Nota{" + "id=" + id + ", valor=" + valor + ", fechaExamen=" + fechaExamen + ", esRecuperatorio=" + esRecuperatorio + '}';
    }
}

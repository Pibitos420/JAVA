import java.util.ArrayList;
import java.util.Date;

public class Alumno {
    private long legajo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    private ArrayList<Nota> notas;
    private DivisionCurso curso;
    private ArrayList<Catedra> catedra;
    private boolean NotasCatedrasCompletadas;

    public Alumno(long legajo, String nombre, String apellido, Date fechaNacimiento,DivisionCurso curso,ArrayList<Catedra> catedra) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.notas = new ArrayList<>();
        this.curso=curso;
        this.catedra = catedra;
        this.NotasCatedrasCompletadas = catedrasCompletadas();
    }


    public Nota mejorNota(Integer codigoCatedra){
        Nota mejorNota = null;

        for (Nota nota : notas) {
            if (nota.getEsRecuperatorio()){
                continue;
            }
            if(codigoCatedra != null && !codigoCatedra.equals(nota.getCatedra().getCodigo())){
                continue;
            }
            if (mejorNota == null || nota.getValor() > mejorNota.getValor()) {
                mejorNota = nota;
            }
        }
        return mejorNota;
    }

    public Double promedioNotas(Integer codigoCatedra){
        ArrayList<Double> notasCatedra = new ArrayList<>();
        Double suma = 0.0;
        Double promedio = 0.0;

        if (codigoCatedra != null) {
            for (Nota nota : notas) {
                if (nota.getCatedra().getCodigo() == codigoCatedra) {
                    suma += nota.getValor();
                    notasCatedra.add(nota.getValor());
                }
            }
        }
        else{
            for (Nota nota : notas) {
                suma += nota.getValor();
                notasCatedra.add(nota.getValor());
            }
        }
        promedio = suma / notasCatedra.size();
        return  promedio;
    }

    public boolean catedrasCompletadas(){
        boolean estanCompletadas = false;
        int contador;
        for (Nota nota : notas) {
            contador = 0;
            for (Catedra catedra : catedra) {
                if (nota.getCatedra().equals(catedra.getCodigo())){
                    contador++;
                }
            }if (contador < 5){
                return false;
            }
        }return true;
    }

    public long getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public DivisionCurso getCurso() {
        return curso;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Catedra> getCatedra() {
        return catedra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void addNota(Nota nota) {
        this.notas.add(nota);
    }

    public void setCurso(DivisionCurso curso) {
        this.curso = curso;
    }

    public void addCatedra(ArrayList<Catedra> catedra) {
        this.catedra.addAll(catedra);
    }


    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}

import java.util.ArrayList;

public class DivisionCurso {
    private int codigo;
    private int anio;
    private int division;

    private ArrayList<Catedra> catedras;
    private Escuela escuela;


    public DivisionCurso(int codigo, int anio, int division,ArrayList<Catedra> catedras,Escuela escuela) {
        this.codigo = codigo;
        this.anio = anio;
        this.division = division;
        this.catedras=catedras;
        this.escuela=escuela;
    }


    public int getCodigo() {
        return codigo;
    }

    public int getAnio() {
        return anio;
    }

    public int getDivision() {
        return division;
    }

    public ArrayList<Catedra> getCatedras() {
        return catedras;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCatedras(ArrayList<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    //Codifique en la clase DivisionCurso un método
    //denominado “public Alumno mejorAlumnoDivisionCurso()” que
    //retorne el alumno con mejor promedio de notas contemplando la
    //totalidad de cátedras, y cuyo promedio sea el resultante de al menos 5
    //examenes y que nunca haya recuperado.

    public ArrayList<Alumno> alumnosConCatedraCompleta(){
        ArrayList<Alumno> alumnosConCatedraCompleta = new ArrayList<>();
        //Recorre todos los alumnos que hayan completado todas
        //las catedras con mas de 5 contas (Metodo catedraCompletada())
        for(Catedra catedra  : catedras){
            for (Alumno alumno : catedra.getAlumnos()) {
                if(alumno.catedrasCompletadas()){
                    alumnosConCatedraCompleta.add(alumno);}
            }
        }
        return alumnosConCatedraCompleta;
    }
    public Double PromedioDeNotasPorAlumno(Alumno alumno){
            Double suma = 0.0;
            Double promedioActual = 0.0;
            Double promedio = 0.0;
            for (Catedra catedra : catedras) {
                promedioActual = alumno.promedioNotas(catedra.getCodigo());
                suma += promedioActual;
            }
            promedio = suma / catedras.size();
            return promedio;
    }
    public Alumno mejorAlumnoDivision(){
        ArrayList<Alumno> alumnosCC =alumnosConCatedraCompleta();
        Alumno alumnoConMejorPormedio = null;
        Double promedio = 0.0;
        for(Alumno alumno : alumnosCC){
            if(promedio < PromedioDeNotasPorAlumno(alumno)){
                promedio = PromedioDeNotasPorAlumno(alumno);
                alumnoConMejorPormedio = alumno;
            }
        }
        return alumnoConMejorPormedio;
    }


    @Override
    public String toString() {
        return "DivisionCurso{" + "codigo=" + codigo + ", anio=" + anio + ", division=" + division + '}';
    }
}




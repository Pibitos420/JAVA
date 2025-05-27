package Clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Escuela {
    private int numero;
    private String denominacion;

    private ArrayList<DivisionCurso> division;


    public Escuela(int numero, String denominacion) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.division = new ArrayList<>();
    }

    public List<Alumno> getMejoresAlumnos(int anioNacimientoAlumno) {
        List<Alumno> candidatos = new ArrayList<>();
        // Recorro todas las divisiones y alumnos
        for (DivisionCurso division : this.division) {
            for (Catedra catedra : division.getCatedras()) {
                for (Alumno alumno : catedra.getAlumnos()) {
                    // Filtrar por año de nacimiento
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(alumno.getFechaNacimiento());
                    int anio = cal.get(Calendar.YEAR);
                    if (anio == anioNacimientoAlumno) {
                        // Si nunca desaprobó (todas sus notas >= 6)
                        if (alumno.nuncaDesaprobo()) {
                            candidatos.add(alumno);
                        }
                    }
                }
            }
        }
        // Ordeno por promedio de notas (de mayor a menor)
        candidatos.sort((a1, a2) -> Double.compare(a2.promedioNotasGeneral(), a1.promedioNotasGeneral()));
        // Devuelvo los 3 mejores (o menos si hay pocos)
        return candidatos.size() > 3 ? candidatos.subList(0, 3) : candidatos;
    }


    public Alumno getMejorAlumnoEscuela(int anioNacimientoAlumno) {
        Alumno mejorAlumno = null;
        double mejorPromedio = -1;

        for (DivisionCurso division : this.getDivision()) {
            for (Catedra catedra : division.getCatedras()) {
                for (Alumno alumno : catedra.getAlumnos()) {
                    // Año de nacimiento del alumno
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(alumno.getFechaNacimiento());
                    int anioNacimiento = cal.get(Calendar.YEAR);

                    if (anioNacimiento == anioNacimientoAlumno) {
                        boolean desaprobo = false;
                        double suma = 0;
                        int count = 0;

                        for (Nota nota : alumno.getNotas()) {
                            Double valor = nota.getValor();
                            if (valor == null) continue; // <---- IGNORA LAS NOTAS NULAS

                            if (!nota.getEsRecuperatorio()) { // Solo notas regulares
                                suma += nota.getValor();
                                count++;
                                if (nota.getValor() < 6.0 || nota.getValor() > 9.0) {
                                    desaprobo = true;
                                    break;
                                }
                            }
                        }

                        if (!desaprobo && count > 0) {
                            double promedio = suma / count;
                            if (promedio > mejorPromedio) {
                                mejorPromedio = promedio;
                                mejorAlumno = alumno;
                            }
                        }
                    }
                }
            }
        }
        return mejorAlumno;
    }

    public void agregarDivision(DivisionCurso division) {
        this.division.add(division);
    }

//    public Alumno getMejorAlumnoEscuela(int anioNacimientoAlumno) {
//        ArrayList<Alumno> alumnoCorrecto= new ArrayList<>();
//        Alumno mejorAlumno = null;
//
//
//        for (DivisionCurso divisionCurso : this.division) {
//            for (Catedra catedra : divisionCurso.getCatedras()) {
//                if (catedra.mejorAlumnoCatedra().getFechaNacimiento().equals(anioNacimientoAlumno)) {
//                    if (catedra.mejorAlumnoCatedra().promedioNotas() >= mejorAlumno {
//
//                    }
//                    mejorAlumno = catedra.mejorAlumnoCatedra();
//
//                    alumnoCorrecto.add(catedra.mejorAlumnoCatedra());
//                }
//            for (Alumno alumno : alumnoCorrecto) {
//                if ()
//            }
//
//                for (Alumno alumno : catedra.getAlumnos()) {
//                    if (alumno.getFechaNacimiento().equals(anioNacimientoAlumno)) {
//                        for (Nota nota : alumno.getNotas()) {
//                            if (nota.getEsRecuperatorio()) {
//                                break;
//                            }
//                            alumnoAN.add(alumno);
//                        }
//                    }
//                }
//            }
//        }
//
//        for (Alumno alumno : alumnoAN) {
//
//        }
//    }

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

    @Override
    public String toString() {
        return "Clases.Escuela{" + "numero=" + numero + ", denominacion=" + denominacion + '}';
    }
}
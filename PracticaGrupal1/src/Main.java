import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Escuela
        Escuela escuela = new Escuela(123, "Escuela Nacional");

        // DivisionCurso
        DivisionCurso division1 = new DivisionCurso(1, 2024, 3);

        // Catedra
        Catedra catedra1 = new Catedra(10, "Matemática");

        // Alumno
        Alumno alumno1 = new Alumno(1001L, "JuanCruz", "Cruz", new Date());

        // Nota
        Nota nota1 = new Nota(1, 9.5, new Date(), false);
        Nota nota2 = new Nota(2, 7.0, new Date(), true);

        //Testing
//        alumno1.mejorNota(nota1);
//        alumno1.promedioNotas();
//        catedra1.mejorAlumnoCatedra();
//        division1.mejorAlumnoDivisionCurso();
//        escuela.getMejorAlumnoEscuela();
//        escuela.getMejoresAlumnos();


        System.out.println("Alumno cargado: " + alumno1.getNombre() + " " + alumno1.getApellido());
        System.out.println("Cátedra: " + catedra1.getDenominacion());
        System.out.println("Escuela: " + escuela.getDenominacion());

    }
}
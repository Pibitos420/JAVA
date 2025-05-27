package Test;
import Clases.*;
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Crear escuela
        Escuela escuela = new Escuela(1, "Escuela Nacional");

        // División
        DivisionCurso division1 = new DivisionCurso(1, 2024, 1);

        // Cátedras
        Catedra matematicas = new Catedra(101, "Matemáticas");
        Catedra literatura = new Catedra(102, "Literatura");

        // Alumnos
        Calendar cal = Calendar.getInstance();

        // Alumno 1 - 2006, JuanCruz
        cal.set(2006, Calendar.MARCH, 10);
        Alumno alumno1 = new Alumno(1, "Juan Cruz", "Pérez", cal.getTime());

        // Alumno 2 - 2006, sí desaprobó
        cal.set(2006, Calendar.APRIL, 15);
        Alumno alumno2 = new Alumno(2, "Santiago", "Sordi", cal.getTime());

        // Alumno 3 - 2005, nunca desaprobó
        cal.set(2005, Calendar.JANUARY, 20);
        Alumno alumno3 = new Alumno(3, "Adrian", "Fredes", cal.getTime());

        // Agregar notas a alumnos
        alumno1.agregarNota(new Nota(1, 6.0, new Date(), false)); // Juan - aprobado
        alumno1.agregarNota(new Nota(2, 8.0, new Date(), false)); // Juan - aprobado

        alumno2.agregarNota(new Nota(3, 4.0, new Date(), true)); // Ana - desaprobada

        alumno3.agregarNota(new Nota(4, 10.0, new Date(), true)); // Luis - aprobado

        // Cargar alumnos a cátedras
        matematicas.agregarAlumno(alumno1);
        matematicas.agregarAlumno(alumno2);
        matematicas.agregarAlumno(alumno3);

        literatura.agregarAlumno(alumno1);
        literatura.agregarAlumno(alumno2);

        // Cargar cátedras a división
        division1.agregarCatedra(matematicas);
        division1.agregarCatedra(literatura);

        // Agregar división a escuela
        escuela.agregarDivision(division1);

        // Prueba
        int anio = 2006;
        Alumno mejorAlumno = escuela.getMejorAlumnoEscuela(anio);

        if (mejorAlumno != null) {
            System.out.println("El mejor alumno de la escuela nacido en " + anio + " (sin desaprobar): " + mejorAlumno.getNombre() + " " + mejorAlumno.getApellido());
        } else {
            System.out.println("No hay alumnos que cumplan con los criterios.");
        }
    }
}

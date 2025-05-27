package Test;
import Clases.*;
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Crear escuela
        Escuela escuela = new Escuela(1, "Escuela Nacional");

        // Crear división
        DivisionCurso division1 = new DivisionCurso(1, 2024, 1);

        // Crear cátedra
        Catedra matematica = new Catedra(1, "Matematica");

        // Crear alumnos con año de nacimiento 2005 y uno de otro año
        Calendar cal = Calendar.getInstance();

        cal.set(2005, Calendar.MARCH, 10);
        Alumno alumno1 = new Alumno(1L, "Juan", "Gomez", cal.getTime());
        cal.set(2005, Calendar.JUNE, 20);
        Alumno alumno2 = new Alumno(2L, "Ana", "Lopez", cal.getTime());
        cal.set(2005, Calendar.APRIL, 25);
        Alumno alumno3 = new Alumno(3L, "Luis", "Martinez", cal.getTime());
        cal.set(2005, Calendar.JANUARY, 8);
        Alumno alumno4 = new Alumno(4L, "Sara", "Perez", cal.getTime());
        cal.set(2006, Calendar.JANUARY, 8);
        Alumno alumno5 = new Alumno(5L, "Mario", "Perez", cal.getTime());

        // Crear notas (todas aprobadas >=6, excepto alumno4 que desaprueba)
        Nota nota1 = new Nota(1, 9.0, new Date(), false);
        nota1.setCatedra(matematica);
        alumno1.agregarNota(nota1);

        Nota nota2 = new Nota(2, 8.0, new Date(), false);
        nota2.setCatedra(matematica);
        alumno1.agregarNota(nota2);

        Nota nota3 = new Nota(3, 7.0, new Date(), false);
        nota3.setCatedra(matematica);
        alumno2.agregarNota(nota3);

        Nota nota4 = new Nota(4, 9.5, new Date(), false);
        nota4.setCatedra(matematica);
        alumno2.agregarNota(nota4);

        Nota nota5 = new Nota(5, 10.0, new Date(), false);
        nota5.setCatedra(matematica);
        alumno3.agregarNota(nota5);

        Nota nota6 = new Nota(6, 9.5, new Date(), false);
        nota6.setCatedra(matematica);
        alumno3.agregarNota(nota6);

        Nota nota7 = new Nota(7, 5.0, new Date(), false); // Desaprobada
        nota7.setCatedra(matematica);
        alumno4.agregarNota(nota7);

        Nota nota8 = new Nota(8, 8.0, new Date(), false); // Otro año
        nota8.setCatedra(matematica);
        alumno5.agregarNota(nota8);

        // Agregar alumnos a cátedra
        matematica.agregarAlumno(alumno1);
        matematica.agregarAlumno(alumno2);
        matematica.agregarAlumno(alumno3);
        matematica.agregarAlumno(alumno4);
        matematica.agregarAlumno(alumno5);

        // Agregar cátedra a división
        division1.agregarCatedra(matematica);

        // Agregar división a escuela
        escuela.agregarDivision(division1);

        // Listar los 3 mejores nacidos en 2005 que nunca desaprobaron
        List<Alumno> mejores = escuela.getMejoresAlumnos(2005);
        System.out.println("Top 3 mejores alumnos nacidos en 2005 (que nunca desaprobaron):");
        for (Alumno a : mejores) {
            System.out.println(a.getNombre() + " " + a.getApellido() + " - Promedio: " + a.promedioNotasGeneral());
        }
    }
}


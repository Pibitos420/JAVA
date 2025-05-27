package Test;
import Clases.*;
import java.util.Date;


public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear División
        DivisionCurso division = new DivisionCurso(1,2020,1);

        // Crear Cátedras
        Catedra matematica = new Catedra(1, "Matemática");
        Catedra historia = new Catedra(2, "Historia");

        // Agregar cátedras a la división
        division.agregarCatedra(matematica);
        division.agregarCatedra(historia);

        // Crear alumnos
        Alumno alumno1 = new Alumno(1001, "Juan Cruz", "Ana", new Date());
        Alumno alumno2 = new Alumno(1002, "Santiago", "Sordi", new Date());

        //Crear notas
        Nota nota1 = new Nota(1, 7.0, new Date(), false);
        nota1.setCatedra(matematica);

        Nota nota2 = new Nota(2, 6.0, new Date(), true);
        nota2.setCatedra(historia);

        Nota nota3 = new Nota(3, 9.2, new Date(), false);
        nota3.setCatedra(historia);

        Nota nota4 = new Nota(4, 7.0, new Date(), false);
        nota4.setCatedra(matematica);

        Nota nota5 = new Nota(5, 5.0, new Date(), false);
        nota5.setCatedra(historia);

        // Agregar alumnos a las cátedras
        matematica.agregarAlumno(alumno1);
        matematica.agregarAlumno(alumno2);
        historia.agregarAlumno(alumno1);  // alumno1 está en las dos materias

        // Agregar notas a alumnos
        alumno1.agregarNota(nota1);
        alumno1.agregarNota(nota2);
        alumno1.agregarNota(nota3);
        alumno1.agregarNota(nota5);
        alumno1.agregarNota(nota5);

        alumno2.agregarNota(nota1);
        alumno2.agregarNota(nota1);
        alumno2.agregarNota(nota4);
        alumno2.agregarNota(nota4);
        alumno2.agregarNota(nota1);

        // Probar mejorAlumnoDivisionCurso
        Alumno mejor = division.mejorAlumnoDivisionCurso();

        if (mejor != null) {
            System.out.println("El mejor alumno es: " + mejor.getNombre() + " " + mejor.getApellido());
        } else {
            System.out.println("No hay alumno que cumpla los requisitos.");
        }
    }
}



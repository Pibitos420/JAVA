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
        Alumno juan = new Alumno(1001, "Juan Cruz", "Ana", new Date());
        Alumno ana = new Alumno(1002, "Santiago", "Sordi", new Date());

        // Agregar alumnos a las cátedras
        matematica.agregarAlumno(juan);
        matematica.agregarAlumno(ana);
        historia.agregarAlumno(juan);  // Juan está en las dos materias

        // Agregar notas a alumnos
        juan.agregarNota(new Nota(1, 7.0, new Date(), false, matematica));
        juan.agregarNota(new Nota(2, 9.0, new Date(), false, matematica));
        juan.agregarNota(new Nota(3, 10.0, new Date(), true, historia));
        juan.agregarNota(new Nota(4, 7.5, new Date(), false, historia));
        juan.agregarNota(new Nota(5, 8.5, new Date(), false, matematica));

        ana.agregarNota(new Nota(10, 7.0, new Date(), false, matematica));
        ana.agregarNota(new Nota(7, 7.5, new Date(), false, matematica));
        ana.agregarNota(new Nota(8, 7.8, new Date(), false, matematica));
        ana.agregarNota(new Nota(9, 6.8, new Date(), false, matematica));
        ana.agregarNota(new Nota(10, 8.2, new Date(), false, matematica));

        // Probar mejorAlumnoDivisionCurso
        Alumno mejor = division.mejorAlumnoDivisionCurso();

        if (mejor != null) {
            System.out.println("El mejor alumno es: " + mejor.getNombre() + " " + mejor.getApellido());
        } else {
            System.out.println("No hay alumno que cumpla los requisitos.");
        }
    }
}



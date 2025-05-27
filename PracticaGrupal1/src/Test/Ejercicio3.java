package Test;
import Clases.*;
import java.util.*;


public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear cátedra
        Catedra matematica = new Catedra(1, "Matematica");
        Catedra historia = new Catedra(2, "Historia");

        // Crear alumnos
        Alumno alumno1 = new Alumno(1001, "Juan Cruz", "Ana", new Date());
        Alumno alumno2 = new Alumno(1002, "Santiago", "Sordi", new Date());
        Alumno alumno3 = new Alumno(1003, "Mati", "Gobi", new Date());

        // Crear notas
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

        // Agregar notas a los alumnos (todas de la misma cátedra)
        alumno1.agregarNota(nota1); // Matemática
        alumno1.agregarNota(nota2); // Historia, recuperatorio

        alumno2.agregarNota(nota3); // Historia
        alumno2.agregarNota(nota4); // Matemática

        alumno3.agregarNota(nota5); // Historia
        alumno3.agregarNota(nota1); // Matemática

        // Agregar alumnos a la cátedra
        matematica.agregarAlumno(alumno1);
        matematica.agregarAlumno(alumno2);
        matematica.agregarAlumno(alumno3);

        // Probar mejorAlumnoCatedra()
        Alumno mejor = matematica.mejorAlumnoCatedra();

        if (mejor != null) {
            System.out.println("El mejor alumno es: " + mejor.getNombre() + " " + mejor.getApellido() +
                    " con promedio: " + mejor.promedioNotas(null));
        } else {
            System.out.println("No hay alumnos en la cátedra.");
        }
    }

}

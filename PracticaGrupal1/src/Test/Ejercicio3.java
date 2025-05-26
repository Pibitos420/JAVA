package Test;
import Clases.*;
import java.util.*;


public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear cátedra
        Catedra matematica = new Catedra(1, "Matemática");

        // Crear alumnos
        Alumno alumno1 = new Alumno(1001, "JuanCruz", "Ana", new Date());
        Alumno alumno2 = new Alumno(1002, "Santiago", "Sordi", new Date());
        Alumno alumno3 = new Alumno(1003, "Mati", "Gobi", new Date());

        // Agregar notas a los alumnos (todas de la misma cátedra)
        alumno1.agregarNota(new Nota(1, 7.0, new Date(), false, matematica));
        alumno1.agregarNota(new Nota(2, 8.0, new Date(), false, matematica));

        alumno2.agregarNota(new Nota(3, 9.0, new Date(), false, matematica));
        alumno2.agregarNota(new Nota(4, 9.0, new Date(), false, matematica));

        alumno3.agregarNota(new Nota(5, 6.0, new Date(), false, matematica));
        alumno3.agregarNota(new Nota(6, 7.0, new Date(), false, matematica));

        // Agregar alumnos a la cátedra
        matematica.getAlumnos().add(alumno1);
        matematica.getAlumnos().add(alumno2);
        matematica.getAlumnos().add(alumno3);

        // Probar mejorAlumnoCatedra()
        Alumno mejor = matematica.mejorAlumnoCatedra();

        if (mejor != null) {
            System.out.println("El mejor alumno es: " + mejor.getNombre() + " " + mejor.getApellido() +
                    " con promedio: " + mejor.promedioNotas(null));
        } else {
            System.out.println("No hay alumnos en la cátedra.");
        }
        System.out.println(matematica.mejorAlumnoCatedra());
    }

}

package Test;
import Clases.*;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear cátedras
        Catedra matematica = new Catedra(1, "Matemática");
        Catedra historia = new Catedra(2, "Historia");

        // Crear alumno
        Alumno alumno1= new Alumno(1234, "JuanCruz", "Ana", new Date());

        // Agregar notas de Matemática
        alumno1.agregarNota(new Nota(1, 8.0, new Date(), false, matematica));
        alumno1.agregarNota(new Nota(2, 6.0, new Date(), false, matematica));
        // Agregar notas de Historia
        alumno1.agregarNota(new Nota(3, 9.0, new Date(), false, historia));
        alumno1.agregarNota(new Nota(4, 7.0, new Date(), false, historia));

        // Promedio general
        System.out.println("Promedio general: " + alumno1.promedioNotas(null)); // Debería ser 7.5

        // Promedio Matemática
        System.out.println("Promedio Matemática: " + alumno1.promedioNotas(1)); // Debería ser 7.0

        // Promedio Historia
        System.out.println("Promedio Historia: " + alumno1.promedioNotas(2)); // Debería ser 8.0
    }
}

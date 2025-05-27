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

        // Agregar notas de Matemática
        alumno1.agregarNota(nota1);
        alumno1.agregarNota(nota2);

        // Agregar notas de Historia
        alumno1.agregarNota(nota3);
        alumno1.agregarNota(nota5);

        // Promedio general
        System.out.println("Promedio general: " + alumno1.promedioNotas(null)); // Debería ser 7.5

        // Promedio Matemática
        System.out.println("Promedio Matemática: " + alumno1.promedioNotas(1)); // Debería ser 7.0

        // Promedio Historia
        System.out.println("Promedio Historia: " + alumno1.promedioNotas(2)); // Debería ser 8.0
    }
}

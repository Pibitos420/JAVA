package Test;
import Clases.*;


import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Catedra matematica = new Catedra(1, "Matematica");
        Catedra historia = new Catedra(2, "Historia");

        Alumno alumno1 = new Alumno(1001L, "Juan", "Cruz", new Date());

        // Notas (id, valor, fecha, esRecuperatorio, catedra)
        alumno1.agregarNota(new Nota(1, 8.5, new Date(), false, matematica));
        alumno1.agregarNota(new Nota(2, 6.0, new Date(), true, matematica));    // Es recuperatorio, NO cuenta
        alumno1.agregarNota(new Nota(3, 9.2, new Date(), false, historia));
        alumno1.agregarNota(new Nota(4, 7.0, new Date(), false, matematica));
        alumno1.agregarNota(new Nota(5, 5.0, new Date(), false, historia));

        Nota mejorMatematica = alumno1.mejorNota(1);
        Nota mejorHistoria = alumno1.mejorNota(2);
        Nota mejorGeneral = alumno1.mejorNota(null);

        System.out.println("Mejor nota en Matemática: " +
                (mejorMatematica != null ? mejorMatematica.getValor() : "No hay notas"));

        System.out.println("Mejor nota en Historia: " +
                (mejorHistoria != null ? mejorHistoria.getValor() : "No hay notas"));

        System.out.println("Mejor nota general: " +
                (mejorGeneral != null ? mejorGeneral.getValor() : "No hay notas"));
    }



}
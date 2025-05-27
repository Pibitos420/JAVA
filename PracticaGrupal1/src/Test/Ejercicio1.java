package Test;
import Clases.*;


import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Catedra matematica = new Catedra(1, "Matematica");
        Catedra historia = new Catedra(2, "Historia");

        Alumno alumno1 = new Alumno(1001L, "JuanCruz", "Ana", new Date());

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

        // Agregando notas a alumnos
        alumno1.agregarNota(nota1);
        alumno1.agregarNota(nota2); // Es recuperatorio, NO cuenta
        alumno1.agregarNota(nota3);
        alumno1.agregarNota(nota4);
        alumno1.agregarNota(nota5);

        // Probando funcion mejorNotas()
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
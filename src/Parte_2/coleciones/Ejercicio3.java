package Parte_2.coleciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {
    public static void main(String[] args) {
        // a) Crear un arraylist de String con 10 elementos que sean alumno1, alumno2, ..., alumno10.
        ArrayList<String> alumnos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            alumnos.add("alumno" + i);
        }

        // b) Añadir un nuevo elemento que se llame alumno3 a la posición 2 del arraylist.
        alumnos.add(2, "alumno3");

        // c) Imprimir lo que hay utilizando un iterator, ¿hay alguno repetido?
        System.out.println("Contenido del ArrayList utilizando Iterator:");
        Iterator<String> iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // d) Mostrar el número de alumnos que hay
        System.out.println("Número de alumnos: " + alumnos.size());

        // e) Eliminar el primer elemento (posición 0)
        alumnos.remove(0);

        // f) Eliminar todos los elementos del arraylist que sean “alumno3”
        iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("alumno3")) {
                iterator.remove();
            }
        }

        // g) Imprimir de nuevo el contenido del arrayList
        System.out.println("Contenido del ArrayList después de eliminaciones:");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }

        // h) Mostrar de nuevo el número de elementos que tiene
        System.out.println("Número de alumnos después de eliminaciones: " + alumnos.size());

    }
}

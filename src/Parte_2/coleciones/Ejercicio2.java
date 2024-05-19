package Parte_2.coleciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;

        // Leer números hasta que se introduzca un 0
        System.out.println("Introduce números enteros (0 para terminar):");
        while ((numero = scanner.nextInt()) != 0) {
            numeros.add(numero);
        }

        // a) Indicar si el array tiene o no elementos
        if (numeros.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            // a. Además, si tiene, decir cuántos elementos hay
            System.out.println("El ArrayList tiene " + numeros.size() + " elementos.");

            // b) Mostrar los números que se han almacenado en una línea
            System.out.print("Números en una línea: ");
            for (int n : numeros) {
                System.out.print(n + " ");
            }
            System.out.println();

            // c) Mostrar los números que se han almacenado en líneas diferentes
            System.out.println("Números en líneas diferentes:");
            for (int n : numeros) {
                System.out.println(n);
            }

            // d) Mostrar la suma de los números
            int suma = 0;
            for (int n : numeros) {
                suma += n;
            }
            System.out.println("Suma de los números: " + suma);

            // e) Mostrar la media aritmética
            double media = (double) suma / numeros.size();
            System.out.println("Media aritmética: " + media);

            // f) Mostrar los números ordenados (menor a mayor)
            Collections.sort(numeros);
            System.out.println("Números ordenados (menor a mayor): " + numeros);

            // g) Encontrar el número 10 y si está, decir en qué posición está
            int posicion10 = numeros.indexOf(10);
            if (posicion10 != -1) {
                System.out.println("El número 10 está en la posición: " + posicion10);
            } else {
                System.out.println("El número 10 no se encuentra en la lista.");
            }

            // h) Mostrar los números ordenados de mayor a menor
            Collections.sort(numeros);
            Collections.reverse(numeros);
            System.out.println("Números ordenados (mayor a menor): " + numeros);

            // i) Mostrar el máximo y el mínimo
            int max = Collections.max(numeros);
            int min = Collections.min(numeros);
            System.out.println("Número máximo: " + max);
            System.out.println("Número mínimo: " + min);
        }
        scanner.close();
    }
}

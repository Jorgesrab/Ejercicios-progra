package Ejercicios.Arrays.ArraysUni;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ascendente = 0;
        int descendente = 0;
        int[] numerosAleatorios = new int[10];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.println("Introduce un numero entero");
            numerosAleatorios[i] = entrada.nextInt();
        }
        for (int i = 0; i < numerosAleatorios.length - 1; i++) {
            if (numerosAleatorios[i + 1] > numerosAleatorios[i]) {
                ascendente += 1;
            } else if (numerosAleatorios[i + 1] < numerosAleatorios[i]) {
                descendente += 1;
            }
        }
        if (ascendente == 9) System.out.println("Los numeros estan ordenados de manera ascendente");
        else if (descendente == 9) System.out.println("Los numeros estan ordenados de forma descendente");
        else System.out.println("Los numeros no estan ordenados");
    }
}

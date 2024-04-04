package Parte_1.Ejercicios.ClaseArray;

import Parte_1.Ejercicios.Metodos;

import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio_30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] puntuaciones = new int[8];

        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println("introduce un numero para la posicion " + i);
            puntuaciones[i] = entrada.nextInt();

        }
        Arrays.sort(puntuaciones);


        Metodos.SoutArrayInt(puntuaciones);

    }
}

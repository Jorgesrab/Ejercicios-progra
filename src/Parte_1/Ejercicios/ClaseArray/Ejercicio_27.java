package Parte_1.Ejercicios.ClaseArray;

import Parte_1.Ejercicios.Metodos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array ");

        int x = entrada.nextInt();

        System.out.println("Introduce el numero con el que desea rellenar el array");
        int y = entrada.nextInt();


        int[] array = new int[x];


        Arrays.fill(array,y);

        Metodos.SoutArrayInt(array);



    }
}

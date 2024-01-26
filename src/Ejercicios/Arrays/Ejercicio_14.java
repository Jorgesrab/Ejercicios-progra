package Ejercicios.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {

            array[i] = rand.nextInt(10);
            System.out.println("El numero para la posicion " + i + " es " + array[i]);
        }


        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i]);
            }


        }

        int posicion;
        System.out.println("introduce la posicion que deseas eliminar");
        posicion= entrada.nextInt();

        for (int i = posicion; i < array.length; i++) {
            array[i-1]=array[i];



        }
        array[array.length-1]=0;

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i]);
            }


        }
    }
}

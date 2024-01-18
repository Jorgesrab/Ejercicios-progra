package Ejercicios.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            System.out.println("introduce un numero para la posicion " + i);
            array[i] = rand.nextInt(10);
        }



        for (int i = 0; i < array.length; i++) {
            if (i != array.length-1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i]);
            }


        }




    }
}

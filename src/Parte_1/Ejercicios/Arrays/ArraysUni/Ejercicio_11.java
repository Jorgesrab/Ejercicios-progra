package Parte_1.Ejercicios.Arrays.ArraysUni;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = rand.nextInt(10);
            System.out.println("El numero para la posicion " + i + " es "+array[i]);
        }


        int aux= array[0];
        for (int i = 1; i < array.length; i++) {

            array[i-1]=array[i];
            if (i== array.length-1){
                array[i]=aux;
            }


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

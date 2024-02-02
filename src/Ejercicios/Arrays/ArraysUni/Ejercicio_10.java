package Ejercicios.Arrays.ArraysUni;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length-2; i++) {
            System.out.println("introduce un numero para la posicion " + (i+1));
            array[i] = entrada.nextInt();

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }


        System.out.println("Introduce la posicion en la que vas a introducir el numero");
        int posicion = entrada.nextInt();
        System.out.println("In troduce el numero que desea añadir");
        int numeroAñadir= entrada.nextInt();

        for (int i = array.length-2; i >=posicion-1 ; i--) {
            int aux = array[i];
           array[i+1]=array[i];

        }
        array[posicion-1]=numeroAñadir;





        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");

        }


        
    }
}

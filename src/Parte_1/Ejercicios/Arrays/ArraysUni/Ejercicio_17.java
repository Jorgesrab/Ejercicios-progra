package Parte_1.Ejercicios.Arrays.ArraysUni;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("introduce un numero para la posicion " + i);
            array[i] = entrada.nextInt();

        }

        System.out.println("---------------------------------------");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i]);
            }

        }
        System.out.println("---------------------------------------");


        System.out.println("Introduce el numero que deseas buscar");
        int buscar = entrada.nextInt();

        int auxarray=-1;





        for (int i = 0; i < array.length; i++) {
            if (buscar==array[i]){
             auxarray=i;
            }

        }


        System.out.println("---------------------------------------");

        if (auxarray==-1){
            System.out.println("El numero no se ha encontrado");

        }else {
            System.out.println("El numero "+buscar+" esta en la posicion "+ auxarray);
        }

    }
}

package Ejercicios.Arrays;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 5; i++) {
            System.out.println("introduce un numero para la posicion " + (i+1)+" de manera ascendente");
            array[i] = entrada.nextInt();

        }
        System.out.println("Introduce un numero para insentar");
        int numero=entrada.nextInt();

        int i = 3;
        boolean aux=false;
        int posicion = 0;
        int auxBucle=0;


        do {
            posicion= auxBucle;

            auxBucle+=1;

        }while(numero>array[auxBucle]);
        int auxInsertar = 0;
        for (int j = array.length-2; j >=posicion ; j--) {
            array[j+1]=array[j];
            auxInsertar =j;


        }
        array[auxInsertar+1]=numero;


       for (int j = 0; j < array.length; j++) {
            if (j != array.length - 1) {
                System.out.print(array[j] + ",");
            } else {
                System.out.println(array[j]);
            }


        }













    }
}

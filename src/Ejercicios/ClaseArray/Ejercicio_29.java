package Ejercicios.ClaseArray;

import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio_29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int array1[]=new int[10];
        int array2[]= new int[10];





        for (int i = 0; i < array1.length; i++) {
            System.out.println("introduce un numero para la posicion " + i);
            array1[i] = entrada.nextInt();

        }


        for (int i = 0; i < array2.length; i++) {
            System.out.println("introduce un numero para la posicion " + i);
            array2[i] = entrada.nextInt();

        }
        boolean iguales = Arrays.equals(array1,array2);
        if (iguales==true) System.out.println("Los arrays son iguales");
        else System.out.println("Los arrays no son iguales ");
    }
}

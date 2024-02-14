package Ejercicios.Arrays.ArraysUni;

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero de veces que quieres que se repita la secuencia");
        int veces = entrada.nextInt();

        int tamaño=0;
        for (int i = veces; i >=1 ; i--) {
            tamaño+=i;

        }
        


        int[] array = new int[tamaño];
        int auxPosicion=0;
        for (int i = 0; i <= veces; i++) {
            for (int j = 0; j < i; j++) {
                array[auxPosicion]=i;
                auxPosicion+=1;
                
            }
            
        }

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i]);
            }


        }




    }
}

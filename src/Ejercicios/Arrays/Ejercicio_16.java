package Ejercicios.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("introduce un numero para la posicion " + i);
            array1[i] = entrada.nextInt();

        }


        int[] array2 = new int[10];

        for (int i = 0; i < array2.length; i++) {
            System.out.println("introduce un numero para la posicion " + i);
            array2[i] = entrada.nextInt();

        }
        
        
        int[] array3 = new int[20];

        int auxarray1 = 0;
        int auxarray2 = 0;
        
        
        for (int i = 0; i < array3.length; i++) {
            
            if ( auxarray2>9|| ( (auxarray1<=9)&&(array1[auxarray1]<array2[auxarray2]))){
                array3[i]=array1[auxarray1];
                auxarray1+=1;
                
            }else {
                array3[i]=array2[auxarray2];
                auxarray2+=1;
                
            }
            
        }

        for (int i = 0; i < array3.length; i++) {
            if (i != array3.length - 1) {
                System.out.print(array3[i] + ",");
            } else {
                System.out.println(array3[i]);
            }


        }

    }
}


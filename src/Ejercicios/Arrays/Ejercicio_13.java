package Ejercicios.Arrays;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 5; i++) {
            System.out.println("introduce un numero para la posicion " + i+" de manera ascendente");
            array[i] = entrada.nextInt();

        }
        System.out.println("Introduce un numero para insentar");
        int numero= entrada.nextInt();

        int i = 5;
        boolean aux=false;

        do {
            i-=1;

            if ((numero>array[i]&&numero<array[i+1])||(numero>(array[i-1]))&&array[i]==0){
                array[i+1]=array[i];
                array[i+1]=numero;
                aux=true;
            }else {
                array[i+1]=array[i];
            }


        }while (aux == false);

        for (int j = 0; j < array.length; j++) {
            if (j != array.length - 1) {
                System.out.print(array[j] + ",");
            } else {
                System.out.println(array[j]);
            }


        }




    }
}

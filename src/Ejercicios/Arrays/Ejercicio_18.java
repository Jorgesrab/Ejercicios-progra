package Ejercicios.Arrays;

import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero de alturas que desea utilizar");
        int valor = entrada.nextInt();



        double[] array = new double[valor];

        for (int i = 0; i < array.length; i++) {
            System.out.println("introduce la atura para la posicion " + i);
            array[i] = entrada.nextDouble();

        }

        System.out.println(alturaMinima(array));




    }

    private static double media(double[] array) {
        double numeros=0;
        for (int i = 0; i < array.length; i++) {
            numeros += array[i];

        }

        double media = numeros/ array.length;
        return media;


    }


    private static double alturaMaxima(double[] array) {
        double alturaMaxima=array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i]>alturaMaxima){
                alturaMaxima = array[i];
            }


        }
        return alturaMaxima;

    }

    private static double alturaMinima(double[] array) {
        double alturaMinima=array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i]<alturaMinima){
                alturaMinima = array[i];
            }


        }
        return alturaMinima;

    }


}

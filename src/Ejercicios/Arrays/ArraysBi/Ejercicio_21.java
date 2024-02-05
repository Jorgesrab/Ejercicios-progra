package Ejercicios.Arrays.ArraysBi;

import java.util.Random;
import java.util.Scanner;



public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();


        System.out.println("introduce el numero de filas de la matriz");
        int N = entrada.nextInt();
        System.out.println("intoduce el numero de columnas de la matriz");
        int M = entrada.nextInt();





        int array [][]= new int [N][M];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=rand.nextInt();

            }

        }


        Metodos.SoutArraysInt(array);
    }



}

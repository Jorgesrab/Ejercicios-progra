package Parte_1.Ejercicios.Arrays.ArraysBi;

import Parte_1.Ejercicios.Metodos;

public class Ejercicio_20 {
    public static void main(String[] args) {
        int array[][]=new int[5][5];

        int numero=1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               array[i][j]=numero;
               numero+=1;
            }
            
        }

        Metodos.SoutBiArraysInt(array);


    }


}




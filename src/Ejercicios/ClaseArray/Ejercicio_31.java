package Ejercicios.ClaseArray;

import Ejercicios.Metodos;

import java.util.Random;

public class Ejercicio_31 {
    public static void main(String[] args) {

        Random rand = new Random();

        int array [][]=new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]= rand.nextInt(9)+1;

            }

        }
        Metodos.SoutBiArraysInt(array);
        masMenosPuntos(array);

    }

    private static void masMenosPuntos(int array[][]) {


        for (int i = 0; i < array.length; i++) {
            int auxMAs=0;
            int auxMenos=11;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]>auxMAs){
                    auxMAs=array[i][j];

                } else if (array[i][j]<auxMenos) {
                    auxMenos=array[i][j];

                }
            }
            System.out.println("En la fila "+i+" la posicion mas alta es "+auxMAs +" y la posicion mas baja es "+auxMenos);

        }

    }
}

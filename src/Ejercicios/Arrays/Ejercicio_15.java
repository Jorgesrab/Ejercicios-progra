package Ejercicios.Arrays;

import java.util.Random;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arrayInicial = new int[10];
        int[] arrayParImpar = new int[10];
        int[] arrayPosiciones=new int[10];


        for (int i = 0; i < arrayInicial.length; i++) {

            arrayInicial[i] = rand.nextInt(10);
            
        }
        System.out.println("Array inicial:");
        for (int i = 0; i < arrayInicial.length; i++) {
            if (i != arrayInicial.length - 1) {
                System.out.print(arrayInicial[i] + ",");
            } else {
                System.out.println(arrayInicial[i]);
            }


        }

        int auxAsignar=0;
        for (int i = 0; i < 10; i++) {
            if (arrayInicial[i]%2==0){
                arrayParImpar[auxAsignar]=arrayInicial[i];
                arrayPosiciones[auxAsignar]=i+1;
                auxAsignar+=1;
                
            }
            
        }
        for (int i = 0; i < 10; i++) {
            if (arrayInicial[i]%2!=0){
                arrayParImpar[auxAsignar]=arrayInicial[i];
                arrayPosiciones[auxAsignar]=i+1;
                auxAsignar+=1;

            }

        }
        System.out.println("array ordenado");
        for (int i = 0; i < arrayParImpar.length; i++) {
            if (i != arrayParImpar.length - 1) {
                System.out.print(arrayParImpar[i] + ",");
            } else {
                System.out.println(arrayParImpar[i]);
            }


        }
        System.out.println("Posicion inicial");
        for (int i = 0; i < arrayPosiciones.length; i++) {
            if (i != arrayPosiciones.length - 1) {
                System.out.print(arrayPosiciones[i] + ",");
            } else {
                System.out.println(arrayPosiciones[i]);
            }


        }



    }
}

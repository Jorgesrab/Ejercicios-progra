package Ejercicios.Arrays;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[5];

        Scanner entrada = new Scanner(System.in);



        for (int i = 0; i < 5; i++) {
            System.out.println("introduce un numero");
            numeros[i] = entrada.nextInt();

        }


        for(int i: numeros){
            System.out.println(i);
        }
    }
}

package Ejercicios.Arrays;

import java.util.Scanner;

public class Ejercicio_1_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ejercicio;

        System.out.println("Seleccione el ejercicio que quieres");
        ejercicio = entrada.nextInt();

        switch (ejercicio){
            case 1 -> ejercicio_1();
            case 2 -> ejercicio_2();
            case 3 -> ejercicio_3();
            case 4 -> ejercicio_1();
            case 5 -> ejercicio_1();
            case 6 -> ejercicio_1();
            case 7 -> ejercicio_1();
            case 8 -> ejercicio_1();
        }




    }

    private static void ejercicio_1(){
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
    private static void  ejercicio_2(){
        Scanner entrada = new Scanner(System.in);

        int[] numeros;
        numeros = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("introduce un numero");
            numeros[i] = entrada.nextInt();

        }


        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
    private static void ejercicio_3(){

    }
}

package Parte_1.Ejercicios.Arrays.ArraysUni;

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
            case 4 -> ejercicio_4();
            case 5 -> ejercicio_5();
            case 6 -> ejercicio_6();
            case 7 -> ejercicio_7();
            case 8 -> ejercicio_8();
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
        Scanner entrada = new Scanner(System.in);

        int[] numeros;
        numeros = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("introduce un numero");
            numeros[i] = entrada.nextInt();

        }
            int min=numeros[0];
            int max=numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i]>max){
                max = numeros[i];
            }else if (numeros[i]<min){
                min = numeros[i];

            }

        }
        System.out.println("el numero mayo es "+ max);
        System.out.println("el numero menor es "+min);

    }
    private static void ejercicio_4(){

        Scanner entrada = new Scanner(System.in);
        int[] numeros =new int [20];

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("introduce 20 numeros positivos y negativos" );
            numeros[i]= entrada.nextInt();
        }

        int positivos=0;
        int negativos=0;
        for (int i = 0; i < numeros.length ; i++) {

            if (numeros[i]>0){
                positivos = positivos + numeros[i];
            }else {
                negativos = negativos + numeros[i];
            }

        }
        System.out.println("Los numeros positivos suman "+positivos+ " y los negativos "+ negativos);


    }
    private static void ejercicio_5(){

        Scanner entrada = new Scanner(System.in);
        int[] numeros =new int [10];

        int ceros=0;
        int mediaPositivos;
        int mediaNegativos;
        int positivos=0;
        int negativos=0;
        int Npositivos=0;
        int Nnegativos=0;

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("introduce 10 numeros positivos y negativos" );
            numeros[i]= entrada.nextInt();
        }
        for (int i = 0; i < numeros.length ; i++) {

            if (numeros[i]>0){
                Npositivos+=1;
                positivos +=numeros[i];

            }else if (numeros[i]==0){
               ceros+=1;


            }else {
                Nnegativos+=1;
                negativos+=numeros[i];
            }

        }
        mediaPositivos = positivos/Npositivos;
        mediaNegativos = negativos/Npositivos;
        System.out.println("la media de los numeros positivos es "+mediaPositivos+" y la media de los numeros negativos es "+ mediaNegativos+ " y hay "+ceros+" ceros");

    }

    private static void ejercicio_6(){

        Scanner entrada = new Scanner(System.in);
        int[] numeros =new int [10];

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("introduce 10 numeros positivos y negativos" );
            numeros[i]= entrada.nextInt();
        }

        int auxLenght = numeros.length-1;
        System.out.println("Este es el sexto ejercicio");
        for (int i = 0; i < numeros.length/2; i++) {
            System.out.println(numeros[i]+"-"+numeros[auxLenght]);
            auxLenght-=1;


        }
    }
    private static void ejercicio_7(){
        Scanner entrada = new Scanner(System.in);
        int[] A =new int [5];

        for (int i = 0; i < A.length ; i++) {
            System.out.println("introduce 10 numeros positivos y negativos" );
            A[i]= entrada.nextInt();
        }

        int[] B =new int [5];

        for (int i = 0; i < B.length ; i++) {
            System.out.println("introduce 10 numeros positivos y negativos" );
            B[i]= entrada.nextInt();
        }





    }
    private static void ejercicio_8(){
        Scanner entrada = new Scanner(System.in);
        int[] A =new int [12];

        for (int i = 0; i < A.length ; i++) {
            System.out.println("introduce 12 numeros para A" );
            A[i]= entrada.nextInt();
        }

        int[] B =new int [12];

        for (int i = 0; i < B.length ; i++) {
            System.out.println("introduce 12 numeros para B" );
            B[i]= entrada.nextInt();

        }
        int[] C = new int[24];

        int auxC = 0;
        int auxA =0;
        int auxB = 0;
        for (int i = 0; i < C.length/6 ; i++) {


            for (int j = 0; j < 3; j++) {
                C[auxC]=A[auxA];
                auxC+=1;
                auxA+=1;


            }
            for (int j = 0; j < 3; j++) {
                C[auxC]=B[auxB];
                auxB+=1;
                auxC+=1;


            }

        }
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);

        }
    }
}

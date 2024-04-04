package Parte_1.Ejercicios.Arrays.ArraysBi;

import Parte_1.Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio_23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos trabajadores hay en tu empresa");
        int X = entrada.nextInt();


        double array [][]= new double[X][2];

        for (int i = 0; i <X; i++) {
            System.out.println("Introduce el salario del trabajador "+(i+1) );
            array[i][0]= entrada.nextDouble();

            do {


                System.out.println("Introduce el genero del trabajador (Para hombre introduce 0 y par hombre 1)");
                array[i][1]= entrada.nextDouble();
            }while (array[i][1]!=1&&array[i][1]!=0);

        }
        int auxH=0;
        int auxM=0;
        double sueldoH=0;
        double sueldoM=0;
        for (int i = 0; i < X; i++) {
            if (array[i][1]==0){
                sueldoH=sueldoH+array[i][0];
                auxH+=1;
            }else {
                sueldoM=sueldoM+array[i][0];
                auxM+=1;
            }

        }
        sueldoM=sueldoM/auxH;
        sueldoH=sueldoH/auxM;




        Metodos.SoutBiArraysDouble(array);

        System.out.println("Sueldo medio hombre: "+sueldoH);
        System.out.println("Sueldo medio mujeres: "+sueldoM);



    }
}

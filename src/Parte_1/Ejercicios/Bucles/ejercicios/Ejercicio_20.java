package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {


        for (int num = 1; num <=5 ; num++) {


            System.out.println("--------------------");
            for (int i = 1; i <= 10; i++) {

                System.out.println("|    " + num + " * " + i + " = " + num * i + "    |");


            }
            System.out.println("--------------------");
        }
    }
 }


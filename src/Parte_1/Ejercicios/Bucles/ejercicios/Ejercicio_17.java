package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        int num;

        Scanner entradda = new Scanner(System.in);

        System.out.println("introduce un numero");
        num= entradda.nextInt();
        System.out.println("--------------------");
        for (int i = 1; i <= 10; i++) {

            System.out.println("|    "+num+" * "+i+" = "+  num * i+"    |");


        }
        System.out.println("--------------------");
    }
}

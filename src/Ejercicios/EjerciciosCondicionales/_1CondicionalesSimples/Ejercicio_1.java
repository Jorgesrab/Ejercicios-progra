package Ejercicios.EjerciciosCondicionales._1CondicionalesSimples;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int nent;


        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero");
        nent = entrada.nextInt();
        nent = nent +100;

        if (nent > 1000) {
            System.out.println("El numero supera el  mill");
        }else {
            System.out.println("El numero no sipera el mill");
        }


    }
}

package Ejercicios.EjerciciosCondicionales._1CondicionalesSimples;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int Numero;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Escribe un numero para saber si es divisible entre 10");
        Numero = entrada.nextInt();

        if (Numero % 10 == 0 ) {
            System.out.println("Es divisible enter 10");
        }else {
            System.out.println("no es divisible entre 10");
        }
    }
}

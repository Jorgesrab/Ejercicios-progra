package Ejercicios.EjerciciosCondicionales._1CondicionalesSimples;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int Number;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Escribe un numero para saber si es 0");
        Number = entrada.nextInt();

        if (Number == 0) {
            System.out.println("Es 0");
        }else {
            System.out.println("No es 0");
        }
    }
}

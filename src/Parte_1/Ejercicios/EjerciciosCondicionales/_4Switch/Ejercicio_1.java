package Parte_1.Ejercicios.EjerciciosCondicionales._4Switch;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int number;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero del 1 al 7");
        number = entrada.nextInt();

        switch (number) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Marte");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");

        }

    }
}

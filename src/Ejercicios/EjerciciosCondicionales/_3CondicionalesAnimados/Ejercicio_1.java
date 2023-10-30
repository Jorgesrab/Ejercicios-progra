package Ejercicios.EjerciciosCondicionales._3CondicionalesAnimados;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int number1;
        int number2;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero entero");
        number1 = entrada.nextInt();
        System.out.println("Numero entero");
        number2 = entrada.nextInt();

        if (number1 == number2) {
            System.out.println("Los numeros son iguales");
        } else if (number1>number2) {
            System.out.println(number1 + " Es mayor");
        }else {
            System.out.println(number2 +" Es mayor");

        }
    }
}

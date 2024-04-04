package Parte_1.Ejercicios.EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        double number1;
        double number2;
        double number3;
        double temp;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero 1");
        number1 = entrada.nextDouble();
        System.out.println("Numero2");
        number2 = entrada.nextDouble();
        System.out.println("Numero 3");
        number3 = entrada.nextDouble();


        if (number1 > number2) {
        }else {
            temp = number2;
            number2 = number1;
            number1 = temp;
        }

        if (number2 > number3) {
        }else {
            temp = number3;
            number3 = number2;
            number2 = temp;
        }

        if (number1 > number2) {
        }else {
            temp = number2;
            number2 = number1;
            number1 = temp;
        }

        System.out.println(number1+","+number2+","+number3);
    }
}

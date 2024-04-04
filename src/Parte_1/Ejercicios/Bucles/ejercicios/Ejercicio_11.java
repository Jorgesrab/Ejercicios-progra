package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");
        number1 = entrada.nextInt();
        System.out.println("Introduce otro numero");
        number2 = entrada.nextInt();

        if(number2> number1){
            int temp = number1;
            number1= number2;
            number2= temp;
        }

        if (number1 % 2 == 0) {
            for (number1 = number1 + 1; number2 > number1; number1 = number1 + 2) {
                System.out.println("numero impar " + number1);
                System.out.println("numero par " + (number1 + 1));

            }
        } else {
            for (number1 = number1 + 1; number2 > number1; number1 = number1 + 2) {
                System.out.println("numero par " + number1);
                System.out.println("numero impar " + (number1 + 1));

            }
        }
    }
}

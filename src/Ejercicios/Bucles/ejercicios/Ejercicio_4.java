package Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el numero uno");
        number1 = entrada.nextInt();
        System.out.println(" Introduce el numero dos");
        number2 = entrada.nextInt();


        if (number1>number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }


        int numeros = number1;
        if (number1 < number2) {
            while (numeros < number2-1) {
                numeros = numeros + 1;
                System.out.println("Los numeros entre " + number1 + " y " + number2 + " son " + numeros);

            }

        }else {
            System.out.println("No hay numeros entre medias");
        }
    }
}

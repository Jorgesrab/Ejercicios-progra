package Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_2_2 {
    public static void main(String[] args) {
        int number;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero entero");
        number = entrada.nextInt();

        if (number <1) {

            for (int i = number; i <= 1; i++) {

                System.out.println("Contador " + i);

            }
        }else {

            for (int i = number; i >= 1; i--) {

                System.out.println("Contador " + i);

            }


        }

    }
}

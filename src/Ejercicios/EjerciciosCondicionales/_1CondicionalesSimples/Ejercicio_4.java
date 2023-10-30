package EjerciciosCondicionales._1CondicionalesSimples;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int Number;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Escribe un numero para saber si es multiplo de 2 o 3");
        Number = entrada.nextInt();

        if (Number%2 == 0) {
            System.out.println("Es es divisible entre 2");
        }else {
            System.out.println("No es divisible entre 2");
        }

        if (Number % 3 == 0) {
            System.out.println("Es divisible entre 3");
        } else {
            System.out.println("No es divisible entre 3");
        }

    }
}

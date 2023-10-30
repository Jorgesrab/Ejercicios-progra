package Ejercicios.PrimerosEjercicios.Extra;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int año;


        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce un año");
        año = entrada.nextInt();

        if ((año % 4 == 0) && (año % 100 != 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
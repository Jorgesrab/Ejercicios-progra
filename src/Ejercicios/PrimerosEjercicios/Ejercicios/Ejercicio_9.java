package PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        double a;

        System.out.println("Introduce el radio");

        a = entrada.nextDouble();

        System.out.println("La longitud de la circunferencia es ----->"+ (2*Math.PI*a));
        System.out.println("El area de la circunferencia es -----> "+ Math.PI*(a*a));

    }
}

package PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_16 {
    public Ejercicio_16() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce tres numeros");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        System.out.println("La media aritmetica de los numeros es " + (a + b + c) / 3.0);
    }
}
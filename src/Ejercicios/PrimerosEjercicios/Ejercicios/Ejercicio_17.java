package PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_17 {
    public Ejercicio_17() {
    }

    public static void main(String[] args) {
        double d = 15.0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el precio");
        double p = entrada.nextDouble();
        p *= (100.0 - d) / 100.0;
        System.out.println("El precio es: " + p);
    }
}

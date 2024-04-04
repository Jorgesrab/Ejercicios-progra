package Parte_1.Ejercicios.PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_18 {
    public Ejercicio_18() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la nota de cada examen parcial");
        double p1 = entrada.nextDouble();
        double p2 = entrada.nextDouble();
        double p3 = entrada.nextDouble();
        double pt = (p1 + p2 + p3) / 3.0;
        pt *= 0.55;
        System.out.println("Introduce la calificación del examen final");
        double f = entrada.nextDouble();
        f *= 0.3;
        System.out.println("Introduce la calcification del trabajo final ");
        double t = entrada.nextDouble();
        t *= 0.15;
        System.out.println("La nota final es " + (pt + f + t));
    }
}

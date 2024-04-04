package Parte_1.Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        double kilometros;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los kilometros que quieres pasar a millas");
        kilometros = entrada.nextDouble();
        double millas = kilometrosAMillas(kilometros);
        System.out.println(kilometros+ " kilometros son "+ millas+ " millas");



    }

    private static double kilometrosAMillas(double kilpmetros ) {
        return kilpmetros*0.621371;

    }
}

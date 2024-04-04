package Parte_1.Ejercicios.PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {

        double b;// Base
        double a;//Altura

        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce la base");

        b = entrada.nextDouble();

        System.out.println("introduce la altura");

        a = entrada.nextDouble();

        System.out.println("El perimetro es "+ (a*2+b*2));
        System.out.println("El area es "+ (a*b));






    }
}

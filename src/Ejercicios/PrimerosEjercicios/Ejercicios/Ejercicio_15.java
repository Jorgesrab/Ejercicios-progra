package Ejercicios.PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {

        double a;
        double b;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce dos numeros");

        a = entrada.nextDouble();
        b = entrada.nextDouble();

        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));


    }

}

package Parte_1.Ejercicios.PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {

        int a;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero de 5 cifras");

        a = entrada.nextInt();

        System.out.println(a/10000);
        System.out.println(a/1000);
        System.out.println(a/100);
        System.out.println(a/10);
        System.out.println(a);





    }
}

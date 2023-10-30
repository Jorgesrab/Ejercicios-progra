package Ejercicios.PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {

        int a;  //nuemero de tres cifras


        Scanner entrada = new  Scanner (System.in);

        System.out.println("Introduce un numero de tres cifra");

        a = entrada.nextInt();


        System.out.println( "La primera cifra es "+ (a/100));
        System.out.println( "La segunda cifra es "+ ((a/10)%10) );
        System.out.println( "La tercera cifra es "+ (a%10));


    }
}

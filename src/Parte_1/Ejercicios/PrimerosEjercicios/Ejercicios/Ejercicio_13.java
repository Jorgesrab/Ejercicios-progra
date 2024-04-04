package Parte_1.Ejercicios.PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {

        int a;   //Dia
        int b;   //Mes
        int c;   //Año


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu dia de nacimiento");

            a = entrada.nextInt();

        System.out.println("Introduce mes de nacimiento");

            b = entrada.nextInt();

        System.out.println("Introduce año de nacimiento");

            c = entrada.nextInt();



        int d = a+b+c;

        System.out.println( "Tu numero de la suerte es: " + ((d/1000)+(d/100)%10+((d/10)%10 )+(d%10)));

    }
}

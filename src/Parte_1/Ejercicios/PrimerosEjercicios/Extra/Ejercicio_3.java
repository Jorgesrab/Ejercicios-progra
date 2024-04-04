package Parte_1.Ejercicios.PrimerosEjercicios.Extra;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double v1;
        double v2;
        double d;
        double t;



        System.out.println("introduce la distancia que hay entre los coches en Kilometros");

        d = entrada.nextDouble();

        System.out.println("introduce la velocidad del coche que va por detras en km/h");

        v1 = entrada.nextDouble();

        System.out.println("introduce la velocidad del coche que va por delante en km/h");

        v2 = entrada.nextDouble();

        t = (v1-v2)/d;
        t= t * 60;

        System.out.println("tardaran "+t+" minutos");




        

    }
}

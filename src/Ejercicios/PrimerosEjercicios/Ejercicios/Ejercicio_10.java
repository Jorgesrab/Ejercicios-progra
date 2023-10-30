package Ejercicios.PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a; //Velocidad entrada

        System.out.println("Introduce la velocidad");

        a = entrada.nextDouble();

        System.out.println("velocidad: "+a+ "km/h ------> "+(a/3.6)+ "m/s");




    }
}

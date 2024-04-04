package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        double ahorro;

        Scanner entrada = new Scanner(System.in);
        double temp = 0;
        for (int mes = 1; mes <=12 ; mes++) {
            System.out.println("Introduce lo que vas a ahorrar el mes "+mes);
            ahorro = entrada.nextDouble();
            temp = temp + ahorro;
            System.out.println("----------------------------------------------------");
            System.out.println("En el mes "+mes+" llevaras ahorrado "+temp+" euros");
            System.out.println("----------------------------------------------------");



        }
        System.out.println("Felicidades has ahorrado "+temp+" euros durante el año");


    }
}

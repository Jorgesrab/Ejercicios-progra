package Ejercicios.EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        int aforo;
        int precio;
        int numeroEntradas;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce el aforo");
        aforo = entrada.nextInt();
        System.out.println("Introduce el precio");
        precio = entrada.nextInt();
        System.out.println("introduce el numero de entradas");
        numeroEntradas = entrada.nextInt();

        if (numeroEntradas <= aforo*0.20) {
            System.out.println("se canceña el concierto el veneficio es 0");
        } else if (numeroEntradas <= aforo*0.50) {
            System.out.println("El veneficio es de "+(numeroEntradas * (precio*0.75))+" euros");
            
        } else {
            System.out.println("El veneficio es de "+(numeroEntradas*precio)+ " euros");

    }
    }
}

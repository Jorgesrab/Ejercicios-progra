package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        int number;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero entero");
        number = entrada.nextInt();
        int contador;
        for (contador=0; contador <= number; contador++) {
            System.out.println( "Contador "+ contador);

        }
    }
}

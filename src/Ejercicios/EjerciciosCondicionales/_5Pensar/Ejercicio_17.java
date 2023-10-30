package EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        int numeroEntero;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce un numero");
        numeroEntero = entrada.nextInt();

        if (numeroEntero<0) {
            numeroEntero = numeroEntero * -1;
        }
        System.out.println("El valor absoluto es "+numeroEntero);
        }
    }


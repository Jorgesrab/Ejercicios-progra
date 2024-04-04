package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_1_2 {
    public static void main(String[] args) {
        int number;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero entero");
        number = entrada.nextInt();

        int Contador = 0;
        while (Contador <number){
            System.out.println("contador es " + Contador);
            Contador++;

        }
    }
}

package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {

        int base;
        int exponente;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la base ");
        base = entrada.nextInt();
        System.out.println("Introduce el exponente");
        exponente = entrada.nextInt();
        int aux = base;
        for (int i = 1; i < exponente ; i++) {

            base = base *aux;

        }
        System.out.println("El resultado es "+ base);


    }
}

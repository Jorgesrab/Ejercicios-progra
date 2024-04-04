package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int number;

        Scanner entrada = new Scanner(System.in);


        int contadorPositivos = 0;
        int contadorNegaticos = 0;
        int contadorCeros = 0;


        do {

            System.out.println("Introduce un numero");
            number = entrada.nextInt();

            if (number>0){
                contadorPositivos++;

            } else if (number<0) {
                contadorNegaticos++;


            }
        }while (number != 0);

        System.out.println("el numero de positivos es: " + contadorPositivos+ " el numero de negativos es: " + contadorNegaticos);
    }
}


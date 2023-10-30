package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        int number;

        Scanner entrada = new Scanner(System.in);


        int contadorPositivos = 0;
        int contadorNegaticos = 0;
        int contadorCeros = 0;


        for (int i = 0; i < 10; i++) {

            System.out.println("Introduce un numero");
            number = entrada.nextInt();

            if (number>0){
                contadorPositivos++;

            } else if (number<0) {
                contadorNegaticos++;

            } else if (number==0) {
                contadorCeros++;

                }
            }

            System.out.println("el numero de positivos es: " + contadorPositivos+ " el numero de negativos es: " + contadorNegaticos + " el numero de ceros es: " + contadorCeros);
        }

}

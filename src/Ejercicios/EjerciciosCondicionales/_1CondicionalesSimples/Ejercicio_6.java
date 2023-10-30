package Ejercicios.EjerciciosCondicionales._1CondicionalesSimples;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int Number;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");
        Number = entrada.nextInt();

        if (Number>=0 && Number<=9) {
            System.out.println("El numero esta enre 0 y 9");
        }else {
            System.out.println("El numero no esa entre 0 y 9");
        }
    }
}

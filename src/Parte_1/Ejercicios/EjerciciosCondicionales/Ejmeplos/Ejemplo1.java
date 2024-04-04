package Parte_1.Ejercicios.EjerciciosCondicionales.Ejmeplos;

import java.util.Scanner;

/*
Ejemplo de estructura condicional simple (if)
 */
public class Ejemplo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce num1: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce num2: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {  //condición
            System.out.println("num1 es mayor que num2");
        }
        System.out.println("Este mensaje se imprime siempre");


    }
}

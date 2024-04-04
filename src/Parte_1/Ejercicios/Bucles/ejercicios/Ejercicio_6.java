package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int number;
        int fact;
        int auxNumber;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero entero");
        number = entrada.nextInt();
        fact = number -1;
        auxNumber = number;
       while (fact !=0) {

           number = number * fact;
           fact--;

       }
        System.out.println("El factorial de "+auxNumber+ " es "+number);
    }
}

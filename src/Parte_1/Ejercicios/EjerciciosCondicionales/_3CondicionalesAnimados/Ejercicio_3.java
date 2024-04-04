package Parte_1.Ejercicios.EjerciciosCondicionales._3CondicionalesAnimados;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        String number;


        Scanner entrada = new Scanner(System.in);

        System.out.println("escribe un numero entre 0 y 99999");
        number = entrada.nextLine();

        int long1 = number.length();
        System.out.println("El numero tiene "+long1+ " cifras");

    }
}

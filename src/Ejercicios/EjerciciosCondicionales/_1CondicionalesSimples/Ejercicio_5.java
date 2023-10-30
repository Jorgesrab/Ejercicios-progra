package Ejercicios.EjerciciosCondicionales._1CondicionalesSimples;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        String Character1;
        String Character2;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer caracter ");
        Character1 = entrada.nextLine();

        System.out.println("Introduce el segundo caracter");
        Character2 = entrada.nextLine();

        String lower1;

        lower1 = Character1 .toLowerCase();



        String lower2;

        lower2 = Character2 .toLowerCase();

        if (Character1 == lower1){
            System.out.println("El primer caracter es minuscula");
        } else {
            System.out.println("El primer caracter es mayuscula");
        }

        if (Character2 == lower2){
            System.out.println("El segundo caracter es minuscula");
        } else {
            System.out.println("El segundo caracter es mayuscula");
        }


    }
}

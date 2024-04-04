package Parte_1.Ejercicios.EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        String numero;


        Scanner entrda = new Scanner(System.in);
        System.out.println("Introduce un numero del uno al 9999");
        numero = entrda.nextLine();
        int lnumero = numero.length();
        int numero1 = Integer.parseInt(numero);

        switch (lnumero){
            case 1 -> System.out.println("Este numero no pude ser capicua");
            case 2 -> {
                if (numero1 / 10 == numero1 % 10) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
            }
            case  3 -> {
                if (numero1 / 100 == numero1 % 10) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
            }

            case  4 -> {
                if (numero1 / 1000 == numero1 % 10 && (numero1 /100)% 10 ==  (numero1/10)%10) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
            }

        }
    }
}

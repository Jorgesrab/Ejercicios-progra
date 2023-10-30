package EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int mes;
        int dia;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Mes de nacimiento");
        mes = entrada.nextInt();
        System.out.println("Dia de nacimiento");
        dia = entrada.nextInt();

        switch (mes) {
            case 1 -> {
                if (dia >= 20) {
                    System.out.println("Acuario");
                } else {
                    System.out.println("Capricornio");
                }
            }
            case 2 -> {
                if (dia >= 19) {
                    System.out.println("Piscis");
                } else {
                    System.out.println("Acuario");
                }
            }
            case 3 -> {
                if (dia >= 21) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Piscis");
                }
            }
            case 4 -> {
                if (dia >= 20) {
                    System.out.println("Tauro");
                } else {
                    System.out.println("Aries");
                }
            }
            case 5 -> {
                if (dia >= 21) {
                    System.out.println("Geminis");
                } else {
                    System.out.println("Tauro");
                }
            }
            case 6 -> {
                if (dia >= 21) {
                    System.out.println("Cancer");
                } else {
                    System.out.println("Geminis");
                }
            }
            case 7 -> {
                if (dia >= 23) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Cancer");
                }
            }
            case 8 -> {
                if (dia >= 23) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Leo");
                }
            }
            case 9 -> {
                if (dia >= 23) {
                    System.out.println("Libra");
                } else {
                    System.out.println("Virgo");
                }
            }
            case 10 -> {
                if (dia >= 23) {
                    System.out.println("Escorpio");
                } else {
                    System.out.println("Libra");
                }
            }
            case 11 -> {
                if (dia >= 22) {
                    System.out.println("Sagitario");
                } else {
                    System.out.println("Escorpio");
                }
            }
            case 12 -> {
                if (dia >= 22) {
                    System.out.println("Capricornio");
                } else {
                    System.out.println("Sagitario");
                }

            }

        }
    }
}

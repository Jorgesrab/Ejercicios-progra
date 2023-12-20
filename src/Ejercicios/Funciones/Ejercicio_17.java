package Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        int signo;
        double resultado=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Que operacion desea realizar\n" +
                "1     +\n" +
                "2     -\n" +
                "3     *\n" +
                "4     /\n");
        signo = entrada.nextInt();
        System.out.println("introduce el primer numero");
        numero1 = entrada.nextDouble();
        System.out.println("Introduce el segundo numero");
        numero2 = entrada.nextDouble();







        switch (signo) {

            case 1 -> {
                resultado = suma(  numero1,  numero2);
            }
            case 2 -> {
                resultado = resta(  numero1,  numero2);
            }
            case 3 -> {
                resultado = multiplicacion(  numero1,  numero2);
            }
            case 4 -> {
                resultado = division(  numero1,  numero2);
            }

            default -> {
                System.out.println("opcion incorecta");

            }

        }

        System.out.println("el resultado de la opereacion es "+resultado);

    }

    private static double suma(double numero1, double numero2) {
        return numero1 + numero2;

    }
    private static double resta(double numero1, double numero2) {
        return numero1 - numero2;

    }
    private static double multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;

    }
    private static double division(double numero1, double numero2) {
        return numero1 / numero2;

    }
}

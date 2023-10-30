package Ejercicios.EjerciciosCondicionales._2CondicionalDoble;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        double decimalNumber1;



        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero decimal");
        decimalNumber1 = entrada.nextDouble();

        if (decimalNumber1 > -1 && decimalNumber1 <1) {
            System.out.println("Es casi 0");
        }else {
            System.out.println("No es casi 0");
        }


    }
}

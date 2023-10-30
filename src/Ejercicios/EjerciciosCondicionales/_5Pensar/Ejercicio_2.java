package Ejercicios.EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        double decimalNumber1;
        double decimalNumber2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el dividendo");
        decimalNumber1 = entrada.nextDouble();
        System.out.println("Introdice el divisor");
        decimalNumber2 = entrada.nextDouble();

        if (decimalNumber2 == 0 ) {
            System.out.println("No se puede hacer la division");
        }else {
            System.out.println(decimalNumber1+" / "+decimalNumber2+" = "+(decimalNumber1/decimalNumber2));
        }
    }
}

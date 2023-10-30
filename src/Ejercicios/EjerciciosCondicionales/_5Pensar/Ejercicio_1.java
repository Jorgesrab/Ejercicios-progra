package EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        double decimalNumber;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");
        decimalNumber = entrada.nextDouble();

        if (decimalNumber == 0) {
            System.out.println("es 0");
        } else if (decimalNumber<0) {
            System.out.println("Negativo");
        }else {
            System.out.println("Positivo");

        }
    }
}


package EjerciciosCondicionales._2CondicionalDoble;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int number1;
        int number2;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero entero");
        number1 = entrada.nextInt();
        System.out.println("Numero entero");
        number2 = entrada.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + "," + number2);
        }else {
            System.out.println(number2 +","+ number1);
        }
    }
}

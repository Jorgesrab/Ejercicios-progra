package EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {

        int numeroDado;


        Scanner entrada = new Scanner(System.in);

        System.out.println("in troduce la cara del dado que ha salido ");
        numeroDado= entrada.nextInt();

        switch (numeroDado){
            case 1 -> System.out.println("La cara opuesta es seis");
            case 2 -> System.out.println("La cara opuesta es cinco");
            case 3 -> System.out.println("La cara opuesta es cuatro");
            case 4 -> System.out.println("La cara opuesta es tres");
            case 5 -> System.out.println("La cara opuesta es dos");
            case 6 -> System.out.println("La cara opuesta es uno");
            default -> System.out.println("ERROR: numero incorrecto");
        }
    }
}

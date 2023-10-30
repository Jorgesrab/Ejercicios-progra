package PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_19 {
    public Ejercicio_19() {
    }

    public static void main(String[] args) {
        Scanner entrda = new Scanner(System.in);
        System.out.println("introduce un numero");
        int a = entrda.nextInt();
        int b = a / 10;
        int c = a % 10;
        System.out.println("" + c + b);
    }
}

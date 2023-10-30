package PrimerosEjercicios.Extra;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A;
        int B;

        System.out.println("Variable A");
        A = entrada.nextInt();
        System.out.println("Variable B");
        B = entrada.nextInt();

        int a=B;
        int b=A;


        A=a;
        B=b;

        System.out.println("Ahora A vale "+A+ " Y B vale "+B);


    }
}

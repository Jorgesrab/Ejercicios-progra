package Ejercicios.PrimerosEjercicios.Extra;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x1;
        int x2;
        int y1;
        int y2;

        System.out.println("introduce x1 ");

        x1 = entrada.nextInt();

        System.out.println("introduce y1");

        y1 = entrada.nextInt();

        System.out.println("introduce x2");

        x2 = entrada.nextInt();

        System.out.println("introduce y2");

        y2 = entrada.nextInt();


       int xt= (Math.abs(x2-x1));
       int yt= (Math.abs(y2-y1));


        System.out.println("La distancia es "+ Math.sqrt(xt+yt));
    }
}

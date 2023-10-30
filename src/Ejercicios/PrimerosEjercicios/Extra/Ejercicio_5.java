package PrimerosEjercicios.Extra;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        int c;
        int i;
        int n;

        Scanner entrada=new Scanner(System.in);

        System.out.println("Respuestas correcatas");
        c = entrada.nextInt();
        System.out.println("respuestas incorrectas");
        i = entrada.nextInt();
        System.out.println("Respuestas en blanco");
        n = entrada.nextInt();

        System.out.println("Tu nota es "+((c*5)-i));




    }
}

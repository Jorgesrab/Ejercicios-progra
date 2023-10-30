package Ejercicios.Bucles.Ejemplos;

import java.util.Scanner;

public class Ejemplo2Bucles {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        do {
            //entra al bucle una vez al menos
            System.out.println ("Introduce un número entre 1 y 10, ambos incluidos");
            c = sc.nextInt();
        } while ((c < 1) || (c > 10)); // Mientras los números que introduzca
        // no estén entre 1 y 10, se le sigue pidiendo
        System.out.println("Has salido del primer bucle ya que has introducido el "+c);

        do {
            System.out.println ("Elige un número. Pulse 0 para salir.");
            c = sc.nextInt();
        } while (c != 0); // Mientras c no sea cero. Cuando C es 0, sale del bucle
        System.out.println("Has salido del segundo bucle ya que has introducido el "+c);

    }
}

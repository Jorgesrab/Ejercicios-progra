package Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int number;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero entero");
        number = entrada.nextInt();

        int contador = 1;
        while (contador != number) {

            System.out.println("Contador es "+ number );
            if (contador > number){
                number++;
            }else {
                number--;
                }
            }

    }
}

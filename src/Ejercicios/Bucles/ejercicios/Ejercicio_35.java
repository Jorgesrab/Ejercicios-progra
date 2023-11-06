package Ejercicios.Bucles.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_35 {
    public static void main(String[] args) {
        Random r = new Random();
        int respuesta =-1;
        int intentos=0;


        Scanner entrada = new Scanner(System.in);
        int numero = r.nextInt(101);



        System.out.println("En este juego tendras que adivinar un numero entre 0 y 100 incluidos con 10 intentos");
        System.out.println("Empieza introduciendo un numero");


        while (respuesta!= numero && intentos <10){
            respuesta = entrada.nextInt();
            intentos++;
            if (respuesta<numero){
                System.out.println("El numero que quieres adivinar es mayor");
            } else if (respuesta>numero) {

                System.out.println("El numero que quieres adivinar el menor");


            }
            if (respuesta!=numero) System.out.println("\nsigue intentandolo");
            if (intentos!=1) {
                System.out.println("Llevas " + intentos + " intentos");
            }else {
                System.out.println("Llevas " + intentos + " intento");
            }

        }
        if (intentos==10){
            System.out.println("GAME OVER");
        }else {
            System.out.println("Muy bien has adivinado el numero");
        }

    }
}

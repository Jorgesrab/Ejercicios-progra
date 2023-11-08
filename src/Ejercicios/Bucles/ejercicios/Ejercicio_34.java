package Ejercicios.Bucles.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_34 {
    public static void main(String[] args) {

        Random r = new Random();
        int respuesta;


        Scanner entrada = new Scanner(System.in);
        int numero = r.nextInt(101);



        System.out.println("En este juego tendras que adivinar un numero entre 0 y 100 incluidos");
        System.out.println("Empieza introduciendo un numero");
        respuesta = entrada.nextInt();

        while (respuesta!= numero){

            if (respuesta<numero){
                System.out.println("El numero que quieres adivinar es mayor");
            } else if (respuesta>numero) {

                System.out.println("El numero que quieres adivinar el menor");


            }
            if (respuesta!=numero) System.out.println("\nsigue intentandolo");
            respuesta = entrada.nextInt();
        }

        System.out.println("Muy bien has adivinado el numero");
    }
}

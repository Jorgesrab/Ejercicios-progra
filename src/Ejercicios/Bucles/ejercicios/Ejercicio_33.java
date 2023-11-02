package Ejercicios.Bucles.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_33 {
    public static void main(String[] args) {
        System.out.println("Esto es un jueo para mejorar el calculo mental");
        int respuesta;
        int resultado;


        Scanner entrada = new Scanner(System.in);
        Random r  = new Random();




        do {

            int random = r.nextInt(100)+1;
            int random1 = r.nextInt(100)+1;
            System.out.println("Resuelve esta suma:");
            System.out.println(random+"+"+random1+"=");
            resultado=random1+random;
            respuesta = entrada.nextInt();
            if (respuesta == -1) System.out.println("Espero que hayas disfrutado,hasta la proxima.");
            else if (respuesta!=resultado) {
                System.out.println("Respuesta incorrecta, el juego va a finalizar");

            }


        }while (respuesta==resultado && respuesta !=-1);
    }
}

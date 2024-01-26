package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Practica_3_entornos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dificultad;



        System.out.println("¡¡bienvenido al al juego!!");
        System.out.println("El juego consiste en adivinar un numero");
        System.out.println("Acontinuacion se pondra un menu para seleccionar la dificultad");
        System.out.println("1. Dificultad facil numero (1-100) tienes 10 intentos");
        System.out.println("2. Dificultad Media numero (1-500) tienes 25 intentos");
        System.out.println("2. Dificultad dificil numero (1-100) tienes 40 intentos");
        dificultad= entrada.nextInt();

        switch (dificultad){
            case 1 ->{
                DificultadFacil();
            }


            case 2 ->{

            }
            case 3 ->{

            }
        }



    }

    private static void DificultadFacil() {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        int adivinar= rand.nextInt(99)+1;
        int intentoActual;
        int intento=1;
        System.out.println("Has seleccionado la dificultad facil,vamos a jugar");

        do {
            if (intento==1) {
                do {

                    System.out.println("Introduce tu primer intento");
                    intentoActual = entrada.nextInt();
                    if (intentoActual > 100 && intentoActual <= 1) {
                        System.out.println("El intento esta fuera del rango, vuelve a intentarlo");
                    }
                } while (intentoActual > 100 && intentoActual <= 1);

            } else if (intento==20) {
                System.out.println("Vas por tu ultimo intento");
                intentoActual = entrada.nextInt();
                if (intentoActual > 100 && intentoActual <= 1) {
                    System.out.println("El intento esta fuera del rango, vuelve a intentarlo");
                }


            } else {
                System.out.println("Vas por tu intento numero "+intento+" de 20 ");
                intentoActual = entrada.nextInt();
                if (intentoActual > 100 && intentoActual <= 1) {
                    System.out.println("El intento esta fuera del rango, vuelve a intentarlo");
                }
            }

            if (intentoActual>adivinar) System.out.println("Prueba con un numero menor");
            else if (intentoActual<adivinar) System.out.println("prueba con un numero mas alto");
            else System.out.println("muy biennnn lo has adivinado");
            intento+=1;




        }while (intentoActual!=adivinar||intento<=20);



    }
}

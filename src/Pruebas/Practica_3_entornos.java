package Pruebas;

import java.util.Random;
import java.util.Scanner;

public class Practica_3_entornos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego!");
        System.out.println("El juego consiste en adivinar un número.");
        System.out.println("A continuación, se pondrá un menú para seleccionar la dificultad:");
        System.out.println("1. Dificultad fácil: número (1-100), tienes 10 intentos");
        System.out.println("2. Dificultad media: número (1-500), tienes 25 intentos");
        System.out.println("3. Dificultad difícil: número (1-1000), tienes 40 intentos");
        int dificultad = entrada.nextInt();

        switch (dificultad) {
            case 1:
                DificultadFacil();
                break;
            case 2:
                DificultadMedia();
                break;
            case 3:
                DificultadDificil();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private static void DificultadFacil() {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeroAdivinar = rand.nextInt(100) + 1;
        int intentoActual;
        int intento = 0;
        boolean adivinado = false;

        System.out.println("Has seleccionado la dificultad fácil: rango de 1 a 100 y tienes 10 intentos.");

        while (intento < 10 && !adivinado) {
            System.out.println("Introduce tu intento número " + (intento + 1) + ":");
            intentoActual = entrada.nextInt();

            if (intentoActual < 1 || intentoActual > 100) {
                System.out.println("El intento está fuera del rango, vuelve a intentarlo.");
                continue;
            }

            if (intentoActual > numeroAdivinar) {
                System.out.println("Prueba con un número menor.");
            } else if (intentoActual < numeroAdivinar) {
                System.out.println("Prueba con un número más alto.");
            } else {
                System.out.println("¡Muy bien! ¡Lo has adivinado!");
                adivinado = true;
            }

            intento++;
        }

        if (!adivinado) {
            System.out.println("Se han acabado los intentos. El número era " + numeroAdivinar + ".");
        }
    }

    private static void DificultadMedia() {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeroAdivinar = rand.nextInt(500) + 1;
        int intentoActual;
        int intento = 0;
        boolean adivinado = false;

        System.out.println("Has seleccionado la dificultad media: rango de 1 a 500 y tienes 25 intentos.");

        while (intento < 25 && !adivinado) {
            System.out.println("Introduce tu intento número " + (intento + 1) + ":");
            intentoActual = entrada.nextInt();

            if (intentoActual < 1 || intentoActual > 500) {
                System.out.println("El intento está fuera del rango, vuelve a intentarlo.");
                continue;
            }

            if (intentoActual > numeroAdivinar) {
                System.out.println("Prueba con un número menor.");
            } else if (intentoActual < numeroAdivinar) {
                System.out.println("Prueba con un número más alto.");
            } else {
                System.out.println("¡Muy bien! ¡Lo has adivinado!");
                adivinado = true;
            }

            intento++;
        }

        if (!adivinado) {
            System.out.println("Se han acabado los intentos. El número era " + numeroAdivinar + ".");
        }
    }

    private static void DificultadDificil() {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeroAdivinar = rand.nextInt(1000) + 1;
        int intentoActual;
        int intento = 0;
        boolean adivinado = false;

        System.out.println("Has seleccionado la dificultad difícil: rango de 1 a 1000 y tienes 40 intentos.");

        while (intento < 40 && !adivinado) {
            System.out.println("Introduce tu intento número " + (intento + 1) + ":");
            intentoActual = entrada.nextInt();

            if (intentoActual < 1 || intentoActual > 1000) {
                System.out.println("El intento está fuera del rango, vuelve a intentarlo.");
                continue;
            }

            if (intentoActual > numeroAdivinar) {
                System.out.println("Prueba con un número menor.");
            } else if (intentoActual < numeroAdivinar) {
                System.out.println("Prueba con un número más alto.");
            } else {
                System.out.println("¡Muy bien! ¡Lo has adivinado!");
                adivinado = true;
            }

            intento++;
        }

        if (!adivinado) {
            System.out.println("Se han acabado los intentos. El número era " + numeroAdivinar + ".");
        }
    }
}


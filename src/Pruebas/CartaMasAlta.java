package Pruebas;

import java.util.Random;

public class CartaMasAlta {
    public static void main(String[] args) {
        // Creación de las barajas
        int[] baraja1 = crearYBarajarBaraja();
        int[] baraja2 = crearYBarajarBaraja();

        // Puntos de cada baraja
        int puntosBaraja1 = 0;
        int puntosBaraja2 = 0;

        // Comparación de las cartas
        for (int i = 0; i < baraja1.length; i++) {
            if (baraja1[i] > baraja2[i]) {
                puntosBaraja1++;
            } else if (baraja2[i] > baraja1[i]) {
                puntosBaraja2++;
            }
            // En caso de empate, no se suma ningún punto
        }

        // Mostrar resultados
        System.out.println("Puntos Baraja 1: " + puntosBaraja1);
        System.out.println("Puntos Baraja 2: " + puntosBaraja2);

        if (puntosBaraja1 > puntosBaraja2) {
            System.out.println("El ganador es la Baraja 1.");
        } else if (puntosBaraja2 > puntosBaraja1) {
            System.out.println("El ganador es la Baraja 2.");
        } else {
            System.out.println("Es un empate.");
        }
    }

    private static int[] crearYBarajarBaraja() {
        int[] baraja = new int[40];
        // Llenar la baraja
        for (int i = 0; i < 10; i++) { // Cartas del 1 al 10
            for (int j = 0; j < 4; j++) { // Cuatro de cada
                baraja[i * 4 + j] = i + 1;
            }
        }

        // Barajar la baraja
        Random rnd = new Random();
        for (int i = 0; i < 200; i++) {
            int index1 = rnd.nextInt(40);
            int index2 = rnd.nextInt(40);
            int temp = baraja[index1];
            baraja[index1] = baraja[index2];
            baraja[index2] = temp;
        }

        return baraja;
    }
}

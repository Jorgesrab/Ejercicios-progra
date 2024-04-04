package Parte_1.Ejercicios.EjerciciosCondicionales.Ejmeplos;

import java.util.Scanner;

public class Ejemplo4 {
    /**
     * Ejemplo de de estructura condicional  IF-ELSE anidadas
     */
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce puntuacion: ");
            float puntuacion = sc.nextFloat();

            if (puntuacion >= 9) {
                System.out.println("Tienes un SOBRESALIENTE");
            } else if (puntuacion >= 7) {
                System.out.println("Tienes un NOTABLE");
            } else if (puntuacion >= 5) {
                System.out.println("Tienes un APROBADO");
            } else {
                System.out.println("Estás SUSPENSO. Lo siento");
            }
        }
}

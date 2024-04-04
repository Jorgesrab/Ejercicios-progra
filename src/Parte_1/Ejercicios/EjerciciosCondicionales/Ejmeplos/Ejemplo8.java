package Parte_1.Ejercicios.EjerciciosCondicionales.Ejmeplos;

import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota: ");
        int nota = sc.nextInt();
        switch (nota) {
            case 0, 1, 2, 3 , 4 -> {
                System.out.println("Suspenso...");
                System.out.println("Ánimo");
            }
            case 5 -> System.out.println("Sufuciente");
            case 6 -> System.out.println("Bien");
            case 7, 8 ->System.out.println("Notable");
            case 9, 10 -> {
                System.out.println("Sobresaliente");
                System.out.println("Enhorabuena");
            }
            default -> System.out.println("Nota incorrecta");

        }

    }
}

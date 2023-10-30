package EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        String tipo;
        int tamaño;
        double precio;
        double kilos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el tipo (A/B)");
        tipo = entrada.nextLine();
        tipo = tipo.toUpperCase();
        char tipoc = tipo.charAt(0);
        System.out.println("Introduce el tamaño(1/2)");
        tamaño = entrada.nextInt();
        System.out.println("Introduce el precio en euros");
        precio = entrada.nextDouble();
        System.out.println("Introduce los kilos que quieres");
        kilos = entrada.nextDouble();






        switch (tipoc) {
            case 'A' -> {
                switch (tamaño) {
                    case 1 -> System.out.println("El precio es " + ((precio * kilos) + (0.20 * kilos))+ " euros");
                    case 2 -> System.out.println("El precio es " + ((precio * kilos) + (0.30 * kilos))+ " euros");
                }
            }

            case 'B' -> {
                switch (tamaño) {
                    case 1 -> System.out.println("El precio es " + ((precio * kilos) - (0.30 * kilos))+" euros");
                    case 2 -> System.out.println("El precio es " + ((precio * kilos) - (0.50 * kilos))+" euros");
                }
            }
        }
    }
}

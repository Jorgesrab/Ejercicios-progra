package Parte_2.Entornos;

import java.util.Scanner;

/**
 * Clase que contiene métodos para realizar operaciones matemáticas básicas como sumar,
 * calcular la media de tres números y contar cuántos números son mayores
 * que un valor dado. También incluye un metodo main con el que se pueden probar los distintos metodos.
 *  @author Jorge Sánchez Raboso
 *  @version 1
 */
public class Practica_1Tema_4 {

    /**
     * Suma dos números enteros.
     *
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * @return La suma de num1 y num2.
     */
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Calcula la media de tres números enteros.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @param num3 El tercer número.
     * @return La media de num1, num2 y num3.
     */
    public static double calcularMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    /**
     * Cuenta cuántos números son mayores que un límite dado, los numeros son indicados por un valor introducido por el usuario.
     *
     * @param numeros Cantidad de números a evaluar.
     * @param limite El valor límite para comparar si un número es mayor.
     * @return El número de elementos que son mayores que el límite.
     */
    public static int contarMayoresQue(int[] numeros, int limite) {
        int contador = 0;
        for (int num : numeros) {
            if (num > limite) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Metodo main. Permite al usuario realizar operaciones
     * de suma, cálculo de media y contar números mayores que un límite a través de la consola.
     *
     * @param args Argumentos de línea de comandos. No se utilizan en este programa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Suma
        System.out.println("Introduce el primer número para la suma:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número para la suma:");
        int num2 = scanner.nextInt();
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sumar(num1, num2));

        // Media
        System.out.println("\nIntroduce el primer número para calcular la media:");
        num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número para calcular la media:");
        num2 = scanner.nextInt();
        System.out.println("Introduce el tercer número para calcular la media:");
        int num3 = scanner.nextInt();
        System.out.println("La media de " + num1 + ", " + num2 + ", y " + num3 + " es: " + calcularMedia(num1, num2, num3));

        // Contar mayores que
        System.out.println("\n¿Cuántos números deseas introducir?");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Introduce el límite para contar cuántos números son mayores que él:");
        int limite = scanner.nextInt();
        System.out.println("Números mayores que " + limite + ": " + contarMayoresQue(numeros, limite));


    }
}

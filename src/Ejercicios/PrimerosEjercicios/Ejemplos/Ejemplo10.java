package PrimerosEjercicios.Ejemplos;

import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        //¿FUNCIONA BIEN? ¿SOLUCIÓN?
        String nombre2;
        int n2;
        System.out.print("Introduzca un número entero: ");
        n2 = entrada.nextInt();
        entrada.nextLine(); //ES NECESARIO
        System.out.println("El cuadrado es: " + Math.pow(n2,2));
        System.out.print("Introduzca su nombre: ");
        nombre2 = entrada.nextLine(); //leemos correctamente la String
        System.out.println("Hola " + nombre2 + "!!");

    }
}

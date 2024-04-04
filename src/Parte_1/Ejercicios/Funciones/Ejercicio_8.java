package Parte_1.Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        int numero;
        int suma1aN;
        double producto1aN;
        double intermedio1aN;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero entero");
        numero  = entrada.nextInt();


        System.out.println("La suma de los numeros entre 1 y "+numero+" es "+suma1aN(numero));
        System.out.println("El producto de los numeros entre 1 y "+numero+" es "+producto1aN(numero));
        System.out.println("El numero intermedio de "+numero + " es "+ intermedio1aN(numero));






    }

    private static int suma1aN(int numero) {
        int aux = 0;
        for (int i = 1; i <= numero; i++) {
            aux = aux + i;

        }
        return aux;
    }

    private static int producto1aN(int numero) {
        int aux = 1;
        for (int i = 1; i <= numero; i++) {
            aux = aux * i;

        }
        return aux;
    }

    private static double intermedio1aN(double numero) {
        return numero/2;
    }


}

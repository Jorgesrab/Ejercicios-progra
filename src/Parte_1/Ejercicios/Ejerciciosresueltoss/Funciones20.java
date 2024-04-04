package Parte_1.Ejercicios.Ejerciciosresueltoss;

import java.util.Scanner;

/*
    Ejercicio 20.- A partir de este main, implementa las funciones necesarias para realizar
    la conversión a binario de un número y que imprima el resultado.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba un número: ");
    int num = sc.nextInt();
    System.out.println(imprimirFraseBinario(num, convertir(num)));
    }
     */

public class Funciones20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int num =  sc.nextInt();
        System.out.println(imprimirFraseBinario(num, convertir(num)));
    }

    static String imprimirFraseBinario(int n, int bin) {
        return "El número "+n+" en binario es "+bin+".";
    }
    static int convertir(int n) {
        int resultadoBinario;
        if(n == 0 || n == 1) {
            resultadoBinario = n;
        } else {
            resultadoBinario = n % 2 + 10 * convertir(n / 2);
        }
        return resultadoBinario;
    }


}

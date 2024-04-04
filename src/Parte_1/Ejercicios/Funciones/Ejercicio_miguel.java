package Parte_1.Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_miguel {
    public static void main(String[] args) {
        int base;
        int exponente;

        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce la base ");
        base = entrada.nextInt();
        System.out.println("introduce el exponente");
        exponente = entrada.nextInt();
        int tempbase = base;
        int tempbase2 = base;

        for (int i = 0; i < exponente-1; i++) {
            for (int j = 0; j < tempbase2-1; j++) {

                base = base + tempbase;
            }
            tempbase = base;
        }
        System.out.println(base);
    }
}

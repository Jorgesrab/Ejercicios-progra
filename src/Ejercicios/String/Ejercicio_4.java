package Ejercicios.String;

import Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introdice una frase");
        String frase = entrada.nextLine();
        
        String[] palabras = frase.split (" +");

        for (int i = 0; i < palabras.length; i++) {
            if (i != palabras.length - 1) {
                System.out.print(palabras[i] + ",");
            } else {
                System.out.println(palabras[i]);
            }


        }
        
    }
}

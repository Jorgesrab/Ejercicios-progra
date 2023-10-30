package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        char caracter;
        String ofCaracter;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Introduce una vocal");
            ofCaracter = entrada.nextLine();
            ofCaracter = ofCaracter.toLowerCase();
            caracter = ofCaracter.charAt(0);
            if (!ofCaracter.equals(" ")) {
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    System.out.println("Es una vocal");

                } else {
                    System.out.println("No es una vocal");
                }
            }else {
                System.out.println("El programa ha terminado");
            }

        }while (!ofCaracter.equals(" "));
    }
}

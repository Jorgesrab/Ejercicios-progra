package Ejercicios.String;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce una frase:");
        String fraseOriginal = scanner.nextLine();

        // Utiliza StringBuilder para construir la nueva cadena
        StringBuilder fraseModificada = new StringBuilder();

        // Recorre cada carácter de la frase original
        for (int i = 0; i < fraseOriginal.length(); i++) {
            char caracterActual = fraseOriginal.charAt(i);
            fraseModificada.append(caracterActual);
            // Si el carácter actual es un espacio, añade un espacio adicional
            if (caracterActual == ' ') {
                fraseModificada.append(" ");
            }
        }

        // Muestra la frase modificada
        System.out.println("Frase original: " + fraseOriginal);
        System.out.println("Frase modificada: " + fraseModificada.toString());
    }
}
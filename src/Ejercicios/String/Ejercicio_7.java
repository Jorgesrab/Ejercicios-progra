package Ejercicios.String;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce una palabra o frase:");
        String cadena = scanner.nextLine();

        int totalLetras = 0, totalMinusculas = 0, totalMayusculas = 0, totalDigitos = 0, totalNoAlfanumericos = 0;

        // Analiza cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Comprueba si es una letra, y si es así, aumenta el contador correspondiente
            if (Character.isLetter(caracter)) {
                totalLetras++;
                if (Character.isLowerCase(caracter)) {
                    totalMinusculas++;
                } else if (Character.isUpperCase(caracter)) {
                    totalMayusculas++;
                }
            } else if (Character.isDigit(caracter)) {
                // Comprueba si es un dígito
                totalDigitos++;
            } else {
                // Si no es letra ni dígito, es un carácter no alfanumérico
                totalNoAlfanumericos++;
            }
        }

        // Muestra los resultados
        System.out.println("Análisis de la cadena:");
        System.out.println("Total de letras: " + totalLetras);
        System.out.println("Total de minúsculas: " + totalMinusculas);
        System.out.println("Total de mayúsculas: " + totalMayusculas);
        System.out.println("Total de dígitos: " + totalDigitos);
        System.out.println("Total de caracteres no alfanuméricos: " + totalNoAlfanumericos);
    }
}

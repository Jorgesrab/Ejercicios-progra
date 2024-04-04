package Parte_1.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasena;

        // Expresión regular que define los requisitos de la contraseña
        String expresionRegular = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&+=])(?=\\S+$).{8,16}$";

        while (true) {
            System.out.println("Introduce una contraseña que cumpla con los siguientes requisitos:");
            System.out.println("- Al menos una mayúscula y una minúscula.");
            System.out.println("- Longitud de 8 a 16 caracteres.");
            System.out.println("- Al menos un carácter no alfanumérico (@#$%&+=).");
            System.out.println("- Al menos un número.");
            System.out.println("- Sin espacios en blanco.");
            contrasena = scanner.nextLine();

            // Verifica si la contraseña cumple con la expresión regular
            if (contrasena.matches(expresionRegular)) {
                System.out.println("La contraseña es válida.");
                break;
            } else {
                System.out.println("La contraseña no es válida. Por favor, inténtalo de nuevo.");
            }
        }
    }
}

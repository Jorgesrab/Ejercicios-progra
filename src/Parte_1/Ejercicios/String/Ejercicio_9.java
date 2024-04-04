package Parte_1.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto para sustituir tardes por noches");
        String texto = entrada.nextLine();

        String nuevoTexto = texto.replaceFirst("tardes","noches");

        System.out.println(nuevoTexto);


    }


}

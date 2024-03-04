package Ejercicios.String;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase");

        String frase = entrada.nextLine();

        String [] palabra= frase.split(" +");

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length()<=4){
                palabra[i]=palabra[i].toLowerCase();
                
            }else  {
                palabra[i]=palabra[i].toUpperCase();
            }
        }

        for (int i = 0; i < palabra.length; i++) {
            if (i != palabra.length - 1) {
                System.out.print(palabra[i] + ",");
            } else {
                System.out.println(palabra[i]);
            }


        }



    }
}

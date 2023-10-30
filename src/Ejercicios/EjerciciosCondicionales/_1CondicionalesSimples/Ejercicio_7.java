package Ejercicios.EjerciciosCondicionales._1CondicionalesSimples;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        String Word1;
        String Word2;


        Scanner entrada = new Scanner(System.in);


        System.out.println("Pon una palabra");
        Word1 = entrada.nextLine().toLowerCase();
        System.out.println("Pon otra palabra");
        Word2 = entrada.nextLine().toLowerCase();

        if (Word1.equals(Word2)) {
            System.out.println("Las dos palabras son iguales");
        }else {
            System.out.println("Las palabras son distintas");
        }
    }
}

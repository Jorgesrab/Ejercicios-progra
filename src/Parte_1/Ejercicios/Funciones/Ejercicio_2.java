package Parte_1.Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int edad;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce su edad");
        edad = entrada.nextInt();
        if (MayorDeEdas(edad)== true){
            System.out.println("Eres mayor de edad");
        }else if (MayorDeEdas(edad)== false){
            System.out.println("No eres mayor de edad");
        }

    }

    private static boolean MayorDeEdas (int edad){
        if (edad >= 18){
            return true;
        }else{

            return false;
        }

    }

}

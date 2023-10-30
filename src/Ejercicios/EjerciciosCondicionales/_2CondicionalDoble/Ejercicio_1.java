package Ejercicios.EjerciciosCondicionales._2CondicionalDoble;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int Numbre1;
        int Number2;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un numero");
        Numbre1 = entrada.nextInt();
        System.out.println("Dimer otro numero");
        Number2 = entrada.nextInt();

        if (Numbre1 == Number2) {
            System.out.println("Los dos numeros sn iguales");
        } else {
            System.out.println("Los numeros son distintos");
        }
    }
}

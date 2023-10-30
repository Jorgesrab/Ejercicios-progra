package EjerciciosCondicionales._2CondicionalDoble;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        String Character1;
        String Character2;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer caracter ");
        Character1 = entrada.nextLine();

        System.out.println("Introduce el segundo caracter");
        Character2 = entrada.nextLine();



        if (Character1.equals(Character2)) {
            System.out.println("Los dos caracteres son iguales");
        }else {
            System.out.println("Los caracteres son distintos");
        }
    }
}

package EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        double comidaDiaria;
        int numAnimales;
        double kilosPorAnimal;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero de animales");
        numAnimales = entrada.nextInt();
        System.out.println("Comida que se compompra diariamente en kilos");
        comidaDiaria = entrada.nextDouble();
        System.out.println("Kilos de comida por animal");
        kilosPorAnimal = entrada.nextDouble();


        double comidaTotal = numAnimales * kilosPorAnimal;

        if (comidaDiaria > comidaTotal) {
            System.out.println("Hay suficiente comida");
        }else {
            System.out.println("La racion para cada animal es de"+ comidaDiaria / numAnimales+ " kilos" );
        }


    }
}

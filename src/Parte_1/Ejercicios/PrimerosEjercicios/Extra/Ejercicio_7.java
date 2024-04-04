package Parte_1.Ejercicios.PrimerosEjercicios.Extra;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        double no;
        double na;

        Scanner entrada=new Scanner(System.in);

        System.out.println("Numeo de niños");
        no = entrada.nextInt();
        System.out.println("Numero de niñas");
        na = entrada.nextInt();

        double nt= no+na;
        double poro;
        double pora;
        poro = no/nt;
        pora = na/nt;

        System.out.println("porcentaje de niños = "+ poro*100 +"%");
        System.out.println("porcentaje de niñas = "+ pora*100 +"%");

    }
}

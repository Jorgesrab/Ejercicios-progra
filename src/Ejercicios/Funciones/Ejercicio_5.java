package Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        double millas;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdeuce las millas para pasarlo a quilometros");
        millas = entrada.nextDouble();

        System.out.println(millas+" millas son "+millasAKilometros(millas)+" kilometros");

    }

    private static double millasAKilometros(double millas) {
        double kilometros;
        return kilometros = millas*1.60934;

    }

}

package PrimerosEjercicios.Ejercicios;

import java.util.Scanner;

public class Ejercicio_20 {
    public Ejercicio_20() {
    }

    public static void main(String[] args) {
        Scanner entrda = new Scanner(System.in);
        System.out.println("Numero de monedas de un euro");
        double e1 = entrda.nextDouble();
        System.out.println("Numero de monedas de 2 euros");
        double e2 = entrda.nextDouble();
        e2 *= 2.0;
        System.out.println("Numero de monedas de 50 centimos");
        double c50 = entrda.nextDouble();
        c50 *= 0.5;
        System.out.println("Numero de monedas de 20 centimos");
        double c20 = entrda.nextDouble();
        c20 *= 0.2;
        System.out.println("Numero de monedas de 10 centimos ");
        double c10 = entrda.nextDouble();
        c10 *= 0.1;

        double et = (e1 + e2 + c50 + c20 + c10);

        if (et>1) {
            System.out.println("Tienes "+ et + " euros");
                } else {
            System.out.println("Tienes " + (et * 100) + " centimos");
        }


    }
}

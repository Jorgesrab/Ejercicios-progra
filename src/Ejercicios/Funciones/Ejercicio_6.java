package Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        double precio1;
        double precio2;
        double precio3;
        double precioConIVA1;
        double precioConIVA2;
        double precioConIVA3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce los tres precios a los que le quieres aplicar el IVA");
        precio1 = entrada.nextDouble();
        precio2 = entrada.nextDouble();
        precio3 = entrada.nextDouble();


        precioConIVA1 = precioConIVA(precio1);
        precioConIVA2 = precioConIVA(precio2);
        precioConIVA3 = precioConIVA(precio3);

        System.out.println(precio1 +" Son "+precioConIVA1+" si le añades el IVA \n" +
                precio2 +" Son "+precioConIVA2+" si le añades el IVA \n" +
                precio3 +" Son "+precioConIVA3+" si le añades el IVA \n" );

    }

    private static double precioConIVA(double precio) {
        double precioConIVA;
        return precioConIVA = precio * 1.21;

    }
}

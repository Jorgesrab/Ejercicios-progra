package Parte_1.Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        double precioSinDescuento;
        double precioConDescuento;

        Scanner entrada = new Scanner(System.in);

        System.out.println(" introduce el precio sin el descuento aplicado ");
        precioSinDescuento = entrada.nextDouble();
        System.out.println("Introduce el precio sin el descuento");
        precioConDescuento = entrada.nextDouble();
        double descuento = descuentoAplicadi(precioSinDescuento,precioConDescuento);
        if (descuento>100){
            System.out.println("El precio aumenta un "+descuento+"%");
        }else {
            System.out.println("El descuento que se esta aplicando es de "+descuento+"%");

        }
    }

    private static double descuentoAplicadi(double precioSinDescuento, double precioConDescuento ) {
        return precioConDescuento/precioSinDescuento*100;

    }
}

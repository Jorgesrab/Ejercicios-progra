package Parte_1.Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        double ancho;
        double alto;
        double perimetro;
        double area;

        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce el ancho del rectangulo");
        ancho = entrada.nextDouble();
        System.out.println("introduce el ancho del rextamgilo");
        alto = entrada.nextDouble();

        perimetro = perimetroRectangulo(ancho,alto);
        area = areaRectangulo(ancho,alto);

        System.out.println("Su area es "+area+" unidades y su preimetro es de "+perimetro+" unidades");



    }



    private static double perimetroRectangulo(double ancho, double alto) {
        return ancho *2 + alto*2;


    }
    private static double areaRectangulo(double ancho, double alto) {
        return ancho * alto;


    }

}

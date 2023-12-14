package Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        double ancho;
        double alto;
        double perimetro;
        double area;

        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce el ancho del triandulo");
        ancho = entrada.nextDouble();
        System.out.println("introduce el ancho del triandulo");
        alto = entrada.nextDouble();

        perimetro = perimetroRectangulo(ancho,alto);
        area = areaRectangulo(ancho,alto);

    }

    private static double perimetroRectangulo() {

    }

}

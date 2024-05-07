package Parte_2.Ejercicios_pooAvanzado.Ejercicio8_Figuras;

import java.util.ArrayList;

public class Main_Ejercicio8Figuras {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(5);
        Rectangulo r1 = new Rectangulo(2,4);

        c1.imprimir();
        System.out.println("*************************************");
        r1.imprimir();
        r1.escalar(2);
        System.out.println("*************************************");
        r1.imprimir();
        System.out.println("*************************************");

        ArrayList <iFigura2D> figuras = new ArrayList<>();
        figuras.add(c1);
        figuras.add(r1);
        for (iFigura2D figura: figuras) {
            figura.imprimir();

        }
        System.out.println("*************************************");
        for (iFigura2D figura: figuras) {
            figura.escalar(0.1);
            figura.imprimir();

        }
    }
}

package Parte_1.Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        double numero1;
        double numero2;

        Scanner entrada = new Scanner(System.in);


        System.out.println("introduce el primer numero de la multiplicación");
        numero1 = entrada.nextDouble();

        System.out.println("introduce el segundo numero de la multiplicación");
        numero2 = entrada.nextDouble();

        System.out.println("El resultado es "+ multiplicacion(numero1,numero2));





    }
    private static double multiplicacion (double numero1,double numero2){
        return numero1 * numero2;


    }


}

package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_36 {
    public static void main(String[] args) {
        int limiteInferior;
        int limiteSuperior;
        int cantidadPares=0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el limite inferior del intervalo ");
        limiteInferior = entrada.nextInt();

        do {
            System.out.println("Introduce el limite superior del intervalo");
            limiteSuperior= entrada.nextInt();
            if (limiteSuperior<limiteInferior) System.out.println("El limite superior debe ser mayor");


        }while (limiteSuperior<limiteInferior);


        System.out.println("Los numeros del intervalo son:");
        for (int i = limiteInferior; i <=limiteSuperior ; i++) {
            System.out.println(i);
            if (i%2==0){
                cantidadPares++;
            }


        }
        System.out.println("Hay "+cantidadPares+" numeros pares");
    }
}

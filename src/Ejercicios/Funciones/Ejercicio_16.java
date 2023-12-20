package Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero para hacer la tabla de multiplicar");
        numero = entrada.nextInt();

        for (int num = 1; num <=10 ; num++) {


            System.out.println("--------------------");
            for (int i = 1; i <= 10; i++) {

                System.out.println("|    " + num + " * " + i + " = " + num * i + "    |");


            }
            System.out.println("--------------------");
            tablaDeMultiplicar(numero);
        }
    }

    private static void tablaDeMultiplicar(int num) {




        System.out.println("--------------------");
        for (int i = 1; i <= 10; i++) {

            System.out.println("|    "+num+" * "+i+" = "+  num * i+"    |");


        }
        System.out.println("--------------------");

    }
}

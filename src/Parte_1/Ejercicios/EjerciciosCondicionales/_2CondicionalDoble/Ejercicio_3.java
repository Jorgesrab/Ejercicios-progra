package Parte_1.Ejercicios.EjerciciosCondicionales._2CondicionalDoble;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a;
        int b;


        System.out.println("Primer numero");
        a = entrada.nextInt();
        System.out.println("segundo numero");
        b = entrada.nextInt();




        if (a>b){
            System.out.println("el numero mas alto es "+a);

        }else {
            System.out.println("el numero mas alto es "+b);
        }
    }
}

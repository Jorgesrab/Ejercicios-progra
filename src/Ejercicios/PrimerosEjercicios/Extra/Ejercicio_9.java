package Ejercicios.PrimerosEjercicios.Extra;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Primer numero");
        a = entrada.nextInt();
        System.out.println("segundo numero");
        b = entrada.nextInt();
        System.out.println("tercer numero");
        c = entrada.nextInt();



        if ((a>b) && (a>c)){
            System.out.println("el numero mas alto es "+a);
        } else if ((b>a) && (b>c)) {
            System.out.println("el numero mas alto es "+b);

        }else {
            System.out.println("el numero mas alto es "+c);
        }


        if ((a<b) && (a<c)){
            System.out.println("el numero mas bajo es "+a);
        } else if ((b<a) && (b<c)) {
            System.out.println("el numero mas bajo es "+b);

        }else {
            System.out.println("el numero mas bajo es "+c);
        }




    }
}
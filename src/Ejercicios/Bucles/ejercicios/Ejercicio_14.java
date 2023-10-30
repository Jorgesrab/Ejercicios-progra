package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {

        int num = 0;

        Scanner entrada= new Scanner(System.in);


        for (int i = 1; i <= 15; i++) {
            System.out.println(i+" introduce un numero");
            num =num + entrada.nextInt();



        }
        System.out.println("La media aridmetica es "+num/15);
    }
}

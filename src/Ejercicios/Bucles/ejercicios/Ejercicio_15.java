package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        int num = 0;
        int numVeces;
        Scanner entrada= new Scanner(System.in);

        System.out.println("¿Cuantos numeros vas a introducir?");
        numVeces = entrada.nextInt();


        for (int i = 1; i <= numVeces; i++) {
            System.out.println(i+" introduce un numero");
            num =num + entrada.nextInt();



        }
        System.out.println("La media aridmetica es "+num/numVeces);
    }
}

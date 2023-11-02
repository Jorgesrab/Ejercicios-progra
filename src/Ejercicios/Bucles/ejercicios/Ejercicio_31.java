package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_31 {
    public static void main(String[] args) {
        double num;
        int cantNumeros;

        Scanner entrada = new Scanner(System.in);


        System.out.println("introduce el final del intervalo de numeros");

        cantNumeros = entrada.nextInt();




        for (int i = 2; i <=cantNumeros ; i++) {

            num =i;
            boolean primo = true;
            double aux = num - 1;
            double temp;
            do {

                temp = num % aux;
                aux--;
                if (temp == 0) {
                    primo = false;


                }else {




                }

            } while ((temp != 0) && (aux > 1));
            if (primo == true) {
                System.out.println("El numero "+ i +" es primo");


            }

        }
    }
}

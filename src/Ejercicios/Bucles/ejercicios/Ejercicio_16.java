package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        int num=0;

        Scanner entrada= new Scanner(System.in);


        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" introduce un numero");
            int temp = entrada.nextInt();
            if (temp>num) {
                num = temp;

            }

            }
        System.out.println("El numero mas alto es " + num);





        }
    }


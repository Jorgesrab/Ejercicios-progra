package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_39 {
    public static void main(String[] args) {
        String sumaNumeros;
        int numero=0;


        Scanner entrada = new Scanner(System.in);




        do {


            System.out.println("Introduce numeros positivos, podras introducir numeros hasta que pongas un numero menor o igual que 0");
            numero = entrada.nextInt();

        }while (0< numero);

    }
}

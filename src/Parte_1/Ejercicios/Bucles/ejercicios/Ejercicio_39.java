package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_39 {
    public static void main(String[] args) {
        String sumaNumeros ="";
        int numero = 0;
        int temp = 0;

        Scanner entrada = new Scanner(System.in);


        do {


            System.out.println("Introduce numeros positivos, podras introducir numeros hasta que pongas un numero menor o igual que 0");
            temp = entrada.nextInt();

            sumaNumeros = sumaNumeros + String.valueOf(temp);
            numero = numero + temp;
            if (temp != 0){
                sumaNumeros = sumaNumeros + " + ";
            } else  {
                sumaNumeros = sumaNumeros + " = " + numero;

            }

        }while (0< temp);
        System.out.println(sumaNumeros);


    }
}

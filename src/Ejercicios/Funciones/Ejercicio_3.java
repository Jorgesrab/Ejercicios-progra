package Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        number1 = entrada.nextInt();
        System.out.println("Introduce otro numero entero");
        number2 = entrada.nextInt();

        System.out.println("El numero menor es "+ minimo(number1,number2));


    }

    private  static int minimo(int number1,int number2){

        if (number1<number2)return number1;
        else return number2;

    }

}



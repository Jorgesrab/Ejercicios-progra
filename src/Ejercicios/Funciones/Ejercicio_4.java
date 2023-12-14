package Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int numero;


        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce un numero para comprobar si es positivo negativo o 0");
        numero= entrada.nextInt();

        if (dimeSigno(numero)==1){
            System.out.println("El numero es positivo ");
        } else if (dimeSigno(numero)==0) {
            System.out.println("El numero es cero ");
        } else if (dimeSigno(numero)==-1) {
            System.out.println("El nuermo es negativo");

        }
    }
    private static int dimeSigno(int numero) {
        if (numero <0)return -1;
        else if (numero==0) return 0;
        else return 1;

    }

}

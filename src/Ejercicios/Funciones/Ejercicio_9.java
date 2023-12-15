package Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;



        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tres numeros");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        numero3 = entrada.nextInt();

        int auxNumero1 = numero1;
        int auxNumero2 = numero2;
        int auxNumero3 = numero3;

        numero1 = numeroMayor(auxNumero1,auxNumero2);
        numero1 = numeroMayor(auxNumero1,auxNumero3);
        numero1 = numeroMayor(auxNumero2,auxNumero3);
        System.out.println(numero1);



    }



    private static int numeroMayor(int numero1, int numero2) {
        if (numero1>numero2){
            return numero1;
        }else {
            return numero2;
        }

    }
}

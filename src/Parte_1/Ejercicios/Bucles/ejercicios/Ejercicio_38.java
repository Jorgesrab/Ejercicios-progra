package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_38 {
    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);

        do {


            System.out.println("Introduce un numero positivo");
            numero = entrada.nextInt();
            if(numero<0) System.out.println("El numero debe ser mayor o igual a cero\n");

        }while (numero<0);

        int numiz;
        int longitud = 0;

        do {
            numiz=numero/10;
            longitud++;
            numero=numiz;


        }while (numiz!=0);
        System.out.println("El numero introducido tiene "+longitud+" digitos");
    }
}

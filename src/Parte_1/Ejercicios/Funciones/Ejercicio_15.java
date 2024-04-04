package Parte_1.Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        int numero;
        do {


            System.out.println("Introduce numero para comprobar si son primo o introduce 0 para terminar");
            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextInt();
            boolean primo= pruebPrimo(numero);
            if (primo == true) System.out.println("el numero introduciodo es primo");
            else System.out.println("El numero introduciodo no es primo");
        }while (numero!=0);

    }

    private static boolean pruebPrimo(int num) {

        boolean primo = true;
        double aux = num-1;
        double temp;
        do {

            temp = num%aux;
            aux--;
            if (temp == 0){
                primo = false;

            }

        }while ((temp !=0) && (aux >1) );

        return primo;
    }
}

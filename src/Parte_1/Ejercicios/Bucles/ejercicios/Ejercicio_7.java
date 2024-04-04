package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        double number;

        Scanner entrada = new Scanner(System.in);


        double suma=0;
        double cantNumber =-1;
        do { System.out.println("Introduce un numero");
            number = entrada.nextInt();
            suma = suma +number;
            cantNumber++;

        }while (number != 0);

        System.out.println("La suma de todos los numeros es "+suma);
        System.out.println("La media de los numeros es "+ suma/cantNumber);

    }
}

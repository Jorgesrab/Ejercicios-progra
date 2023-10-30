package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        double num;

        Scanner entrada = new Scanner(System.in);


        System.out.println("introduce un numero para saber si es primo");
        num = entrada.nextInt();

        String primo = "El numero es primo";
        double aux = num-1;
        double temp;
        do {

           temp = num%aux;
            aux--;
            if (temp == 0){
                primo = "El numero no es primo";

            }

        }while ((temp !=0) && (aux >1) );
        System.out.println(primo);



    }
}

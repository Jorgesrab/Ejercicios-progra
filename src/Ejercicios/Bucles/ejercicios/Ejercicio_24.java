package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {

        int alturaArbol =0;

        Scanner entrada = new Scanner(System.in);

        int temp;
        int id=0;
        int idMasAlto=0;
        do {
            do {

                System.out.println("Introduce la altura del arbol en centimetros o -1 para continuar");
                temp = entrada.nextInt();
                if (temp<0 && temp !=-1) System.out.println("La altura no puede ser negativa vuelve a intentarlo");
            }while (temp<0 && temp !=-1 );

            id++;
            if (temp > alturaArbol) {
                alturaArbol = temp;
                idMasAlto = id;
            }


        }while (temp != -1);

        System.out.println("El arbol mas alto mide "+alturaArbol+ " y su id es "+idMasAlto);

    }
}

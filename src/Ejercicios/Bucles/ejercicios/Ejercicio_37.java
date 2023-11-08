package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_37 {
    public static void main(String[] args) {

        int numeroMayor = 0;
        int numeroMenor = 0;
        int cantidadNumeros;
        int contNumMay=0;
        int contNumMen=0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la cantidad de numeros que quieres");
        cantidadNumeros = entrada.nextInt();
        int temp ;
        int contIni=0;
        for (int i = 0; i < cantidadNumeros; i++) {

            if (contIni ==0){
                System.out.println("Introduce el primer numero");
                numeroMenor = entrada.nextInt();
                numeroMayor = numeroMenor;
                contIni++;


            }else {

                System.out.println("Introduce el siguiennte numero");
                temp = entrada.nextInt();

                if (temp>numeroMayor){
                    numeroMayor = temp;
                    contNumMay=1;

                } else if (temp==numeroMayor) {
                    contNumMay++;

                }
                if (temp<numeroMenor){
                    numeroMenor = temp;
                    contNumMen=1;

                } else if (temp==numeroMenor) {
                    contNumMen++;

                }


            }


        }
        System.out.println("El numero mas alto es "+numeroMayor+" y se ha introduciodo "+contNumMay+" veces y el numero menor es "+numeroMenor+" y se ha introduciodo "+contNumMen+"veces.");


    }
}

package Parte_1.Ejercicios.ClaseArray;

import Parte_1.Ejercicios.Metodos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_28 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("hasta que numero deseas llegar ");
        int y = entrada.nextInt();
        int x = 0;

        for (int i = 0; i <= y; i++) {
            x=x+i;
        }

        int array[]= new int[x];
        int auxPosicionIni=0;
        int auxPosicionFin=0;

        for (int i = 0; i <= y; i++) {
            auxPosicionFin=auxPosicionFin+i;
            Arrays.fill(array,auxPosicionIni,auxPosicionFin,i);
            auxPosicionIni=auxPosicionIni+i;
        }

        Metodos.SoutArrayInt(array);


    }
}

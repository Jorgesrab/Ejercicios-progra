package Ejercicios.Arrays.ArraysBi;

import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double array[][]=new double[5][8];

        for (int i = 0; i < array.length; i++) {
            System.out.println("************* Datos para el Alumno"+(i+1));
            for (int j = 0; j < array[i].length; j++) {
                if (j<5){
                    Menu(j);
                    array[i][j]= entrada.nextInt();
                } else if (j==5) {
                    System.out.println("La nota minima es "+notaMinima(array,i));

                } else if (j==6) {
                    System.out.println("La nota maxima es "+notaMaxima(array,i));

                } else if (j==7) {
                    System.out.println("La nota media es "+notaMedia(array,i));

                }


            }
        }
        

    }

    private static void Menu (int j) {

        switch (j+1){
            case 1 -> System.out.println("Introduce la nota de programaicon");
            case 2 -> System.out.println("Introduce la nota de Entornos de desarrollo");
            case 3 -> System.out.println("Introduce la nota de Base de datos");
            case 4 -> System.out.println("Introduce la nota de Lenguaje de marcas");
            case 5 -> System.out.println("Introduce la nota de Sistemas informaticos");
            default -> System.out.println("opcion incorrecta");
        }

    }

    private static double notaMinima(double array[][], int i) {

        double notaMinima=array[i][0];
        for (int j = 0; j < 5; j++) {
            if (array[i][j]<notaMinima){
                notaMinima=array[i][j];
            }

        }
        return notaMinima;


    }

    private static double notaMaxima(double array[][], int i) {

        double notaMinima=array[i][0];
        for (int j = 0; j > 5; j++) {
            if (array[i][j]<notaMinima){
                notaMinima=array[i][j];
            }

        }
        return notaMinima;


    }

    private static double notaMedia(double array[][], int i) {

        double notaMedia=0;
        for (int j = 0; j > 5; j++) {
            notaMedia=notaMedia + array[i][j];

        }

        notaMedia = notaMedia/5;
        return notaMedia;


    }

}

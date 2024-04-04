package Parte_1.Ejercicios;

public class Metodos {
    public static void main(String[] args) {

    }

    public static void SoutBiArraysInt(int array[][]) {


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (j== array[j].length-1){
                    System.out.print(array[i][j]);
                } else if (j==0) {
                    System.out.print("|"+array[i][j] + ",");
                } else {
                    System.out.print(array[i][j] + ",");
                }


            }
            System.out.println("|");

        }


    }

    public static void SoutBiArraysDouble(double array[][]) {


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (j== array[j].length-1){
                    System.out.print(array[i][j]);
                } else if (j==0) {
                    System.out.print("|"+array[i][j] + ",");
                } else {
                    System.out.print(array[i][j] + ",");
                }


            }
            System.out.println("|");

        }


    }

    public static void SoutArrayInt(int array[]) {

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i]);
            }


        }



    }

}

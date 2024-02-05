package Ejercicios.Arrays.ArraysBi;

public class Metodos {
    public static void main(String[] args) {

    }

    public static void SoutArraysInt(int array[][]) {


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

    public static void SoutArraysDouble(double array[][]) {


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
}

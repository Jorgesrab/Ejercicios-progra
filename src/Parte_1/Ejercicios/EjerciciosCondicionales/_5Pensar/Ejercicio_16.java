package Parte_1.Ejercicios.EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        int numeroEntero;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce un numero entre 1 y 99");
        numeroEntero = entrada.nextInt();

        if (numeroEntero <20) {
            switch (numeroEntero) {
                case 1 -> System.out.println("Uno");
                case 2 -> System.out.println("dos");
                case 3 -> System.out.println("tres");
                case 4 -> System.out.println("cuatro");
                case 5 -> System.out.println("cinco");
                case 6 -> System.out.println("seis");
                case 7 -> System.out.println("siete");
                case 8 -> System.out.println("ocho");
                case 9 -> System.out.println("nueve");
                case 10 -> System.out.println("diez");
                case 11 -> System.out.println("unce");
                case 12 -> System.out.println("doce");
                case 13 -> System.out.println("trece");
                case 14 -> System.out.println("catorce");
                case 15 -> System.out.println("quince");
                case 16 -> System.out.println("dieciseis");
                case 17 -> System.out.println("diecisiete");
                case 18 -> System.out.println("dieciocho");
                case 19 -> System.out.println("diecinueve");
            }
        }else {
            int primeraCifra = numeroEntero / 10;
            int segundaCifra = numeroEntero % 10;
            String cifra1= null;
            String cifra2= null;

            switch (primeraCifra) {
                case 1 -> cifra1 = "diez";
                case 2 -> cifra1 = "veinte";
                case 3 -> cifra1 = "treinta";
                case 4 -> cifra1 = "cuarenta";
                case 5 -> cifra1 = "cincuenta";
                case 6 -> cifra1 = "sesenta";
                case 7 -> cifra1 = "setenta";
                case 8 -> cifra1 = "ochenta";
                case 9 -> cifra1 = "noventa";
            }

            switch (segundaCifra) {
                case 1 -> cifra2 = "uno";
                case 2 -> cifra2 = "dos";
                case 3 -> cifra2 = "tres";
                case 4 -> cifra2 = "cuatro";
                case 5 -> cifra2 = "cinco";
                case 6 -> cifra2 = "seis";
                case 7 -> cifra2 = "siete";
                case 8 -> cifra2 = "ocho";
                case 9 -> cifra2 = "nueve";
            }

            if (segundaCifra == 0) {
                System.out.println("el numero es " + cifra1);
            } else {
                System.out.println("El numero es " + cifra1 + " y " + cifra2);
            }

        }



    }

}

package Parte_1.Ejercicios.EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        int day;
        int month;
        int year;

        Scanner entrda = new Scanner(System.in);


        System.out.println("Dia");
        day = entrda.nextInt();
        System.out.println("Mes");
        month = entrda.nextInt();
        System.out.println("Año");
        year = entrda.nextInt();

        if (month >=1 && month <=12) {
            switch (month) {
                case 2 -> {
                    if (day < 1 || day > 28) {
                        System.out.println("Fecha incorrecta");
                    } else if (month < 1 && month > 12) {
                        System.out.println("Fecha incorrecta");
                    } else if (year < 0) {
                        System.out.println("Fecha incorrecta");
                    } else {
                        System.out.println("Fecha correcta: " + day + "/" + month + "/" + year);

                    }

                }

                case 1, 3, 5, 7, 8, 10, 12 -> {
                    if (day < 1 || day > 31) {
                        System.out.println("Fecha incorrecta");
                    } else if (month < 1 && month > 12) {
                        System.out.println("Fecha incorrecta");
                    } else if (year < 0) {
                        System.out.println("Fecha incorrecta");
                    } else {
                        System.out.println("Fecha correcta: " + day + "/" + month + "/" + year);

                    }

                }
                case 4, 6, 9, 11 -> {
                    if (day < 1 || day > 30) {
                        System.out.println("Fecha incorrecta");
                    } else if (month < 1 && month > 12) {
                        System.out.println("Fecha incorrecta");
                    } else if (year < 0) {
                        System.out.println("Fecha incorrecta");
                    } else {
                        System.out.println("Fecha correcta: " + day + "/" + month + "/" + year);

                    }


                }

            }
        }else {
            System.out.println("Fecha incorrecta");
        }


    }
}

package Parte_1.Ejercicios.EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        int diast;
        Scanner entrda = new Scanner(System.in);


        System.out.println("Dia");
        day = entrda.nextInt();
        System.out.println("Mes");
        month = entrda.nextInt();
        System.out.println("Año");
        year = entrda.nextInt();
       day = day +1;


        switch (month) {
            case 2 -> {
                if (day ==29){
                    day = day - 28;
                    month = month + 1;


                }
                if (month ==13) {
                    month=month-12;
                    year = year +1;

                }
                System.out.println(day+"/"+month+"/"+year);

            }

            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (day ==32){
                    day = day - 31;
                    month = month + 1;


                }
                if (month ==13) {
                    month=month-12;
                    year = year +1;

                }
                System.out.println(day+"/"+month+"/"+year);


            }


            case 4, 6, 9, 11 -> {
                if (day ==31){
                    day = day - 30;
                    month = month + 1;


                }
                if (month ==13) {
                    month=month-12;
                    year = year +1;

                }
                System.out.println(day+"/"+month+"/"+year);


            }


        }
    }
}

package EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int hour;


        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la hora ");
        hour = entrada.nextInt();
        if (hour >= 6 && hour <=12) {
            System.out.println("buenos Dias");
        } else if ((hour >= 13 && hour <= 20)) {
            System.out.println("buenas tardes");
        } else if (((hour >= 21 && hour >=24) || (hour >= 0 && hour <= 5))) {
            System.out.println("buenas noches");
            
        }

    }


}


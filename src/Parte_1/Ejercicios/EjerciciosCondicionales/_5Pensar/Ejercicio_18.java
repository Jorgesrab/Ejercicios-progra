package Parte_1.Ejercicios.EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        int minutosLlamda;
        double impuesto = 0;
        char dia;
        String turno;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Duracion de la llamada en minutos");
        minutosLlamda = entrada.nextInt();
        System.out.println("Es domingo? y/n");


        dia = entrada.next().charAt(0);
        dia = Character.toLowerCase(dia);








        if (dia == 'y') {
            impuesto = 0.03;
        } else if (dia == 'n') {
            System.out.println("Es turno de mañana o de tarde (mañana/tarde)");
            entrada.nextLine();
            turno = entrada.nextLine();

            if (turno.equalsIgnoreCase("mañana")) {
                impuesto = 0.15;
            } else {
                impuesto = 0.10;
            }
        }

        double precio = 0;

        if (minutosLlamda <=5){
            precio = 1;
        } else if (minutosLlamda >5 && minutosLlamda <=8) {
            precio = (1 + 0.80);
        } else if (minutosLlamda > 8 && minutosLlamda <=10) {
            precio = (1 + 0.80 + 0.70);
        }else if (minutosLlamda > 10) {
            precio = (1 + 0.80 + 0.70 + 0.50);

        }

        System.out.println("tiene que pagar "+ (precio + precio*impuesto)+ " euros");






    }
}

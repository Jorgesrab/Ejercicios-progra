package Parte_1.Ejercicios.EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int hora;
        int minuto;
        int segundo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce la hora");
        hora = entrada.nextInt();
        hora = hora *60*60;

        System.out.println("introduce los minutos");
        minuto = entrada.nextInt();
        minuto = minuto *60;
        System.out.println("introduce los segundos");
        segundo = entrada.nextInt();


        int Tt;
        Tt = hora+minuto+segundo;
        Tt = Tt + 1;

        int horat;
        int mint;
        int segt;

        horat = Tt/60/60;
        mint = (Tt-horat*60*60)/60;
        segt = (Tt-horat*60*60-mint*60);

        if (horat >=24){
            horat = horat -24;
        }

        System.out.println(" Hora +1 segundo = "+ horat+":"+mint+":"+segt);

    }
}

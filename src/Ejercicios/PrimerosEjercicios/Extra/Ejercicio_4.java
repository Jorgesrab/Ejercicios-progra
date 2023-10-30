package PrimerosEjercicios.Extra;



import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        int horas;
        int mins;
        int secs;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce la hora de salida");
        horas = entrada.nextInt();
        horas = horas *60*60;

        System.out.println("introduce los minutos");
        mins = entrada.nextInt();
        mins = mins *60;
        System.out.println("introduce los segundos");
        secs = entrada.nextInt();

        int Tt;
        Tt = horas+mins+secs;

        int t;
        System.out.println("introdeuce el tiempo que has tardado en segundos");
        t= entrada.nextInt();

        Tt = Tt+t;

        int horat;
        int mint;
        int segt;

        horat = Tt/60/60;
        mint = (Tt-horat*60*60)/60;
        segt = (Tt-horat*60*60-mint*60);

        int dia = 0;
        while (horat > 24) {
            if (horat > 24) {
                horat = horat - 24;
            } else {

            }
            dia = dia + 1;
        }

        System.out.println("dia/s trancurridos "+dia+" Hora de llegada "+ horat+":"+mint+":"+segt);









    }

}

package Parte_1.Ejercicios.Bucles.ejercicios;

public class Ejercicio_27 {
    public static void main(String[] args) throws InterruptedException {


        int horas=0;
        int minutos=0;
        int segundos=0;

        while (horas<23 || minutos <59 || segundos<59){

            segundos++;
            if (segundos==60){
                segundos=segundos-60;
                minutos++;
            }
            if (minutos==60){
                minutos=minutos-60;
                horas++;
            }
            Thread.sleep(1000);
            System.out.println(horas+":"+minutos+":"+segundos);



        }
    }
}

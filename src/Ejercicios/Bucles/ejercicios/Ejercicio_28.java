package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_28 {
    public static void main(String[] args) throws InterruptedException {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        int auxHoras;
        int auxMinutos;
        int auxSegundos;

        Scanner entrada = new Scanner(System.in);

        do {


            System.out.println("Introduce las horas que quieres cronometrar");
            auxHoras = entrada.nextInt();
            if (auxHoras < 0) System.out.println("Las horas no pueden ser negativas");
        } while (auxHoras < 0);


        do {


            System.out.println("Introduce los minutos que desea conometrar");
            auxMinutos = entrada.nextInt();


            if (auxMinutos < 0) {
                System.out.println("Los minutos no pueden ser negativos");
            } else if (auxMinutos >= 60) {
                System.out.println("los minutos no pueden ser mayor a 59, haber introducido mas horas");

            }
        }while (auxMinutos < 0 || auxMinutos > 59) ;

            do {


                System.out.println("Introduce los segundos que quieres cronometrar");
                auxSegundos = entrada.nextInt();
                if (auxSegundos < 0) {
                    System.out.println("Los segundos no pueden ser negativos");
                } else if (auxSegundos >= 60) {
                    System.out.println("los segundos no pueden ser mayor a 59, habe introducido mas minutos");

                }
            }while (auxSegundos < 0 || auxSegundos > 59) ;


                while (horas < auxHoras || minutos < auxMinutos || segundos < auxSegundos) {

                    segundos++;
                    if (segundos == 60) {
                        segundos = segundos - 60;
                        minutos++;
                    }
                    if (minutos == 60) {
                        minutos = minutos - 60;
                        horas++;
                    }

                    System.out.println(horas + ":" + minutos + ":" + segundos);
                }

            }
        }
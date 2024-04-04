package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_32 {
    public static void main(String[] args) {
        int dinero;
        int billete500=0;
        int billete200=0;
        int billete100=0;
        int billete50=0;
        int billete20=0;
        int billete10=0;
        int billete5=0;

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Introduce una cantidad de euros que sea multiplo de 5");
            dinero = entrada.nextInt();
            if (dinero%5 != 0) System.out.println("La cantidad introducida no es multiplo de 5 vuelve a intentarlo");

        }while (dinero%5 != 0);

        while (dinero>=500){

            dinero=dinero-500;
            billete500= billete500+1;

        }
        while (dinero>=200){

            dinero=dinero-200;
            billete200= billete200+1;

        }
        while (dinero>=100){

            dinero=dinero-100;
            billete100= billete100+1;

        }
        while (dinero>=50){

            dinero=dinero-50;
            billete50= billete50+1;

        }
        while (dinero>=20){

            dinero=dinero-20;
            billete20= billete20+1;

        }
        while (dinero>=10){

            dinero=dinero-10;
            billete10= billete10+1;

        }
        while (dinero>=5){

            dinero=dinero-5;
            billete5= billete5+1;

        }
        System.out.println("\ntienes "+billete500+" billestes de 500"+"\ntienes "+billete200+" billestes de 200"+"\ntienes "+billete100+" billestes de 100"+"\ntienes "+billete50+" billestes de 50"+"\ntienes "+billete20+" billestes de 20"+"\ntienes "+billete10+" billestes de 10"+"\ntienes "+billete5+" billestes de 5");
    }
}

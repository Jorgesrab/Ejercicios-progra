package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicoio_40 {
    public static void main(String[] args) {
        String sumaNumeros ="";
        int numero = 0;
        int temp = 0;
        int longitud = 0;
        int sumaInterna = 0;

        Scanner entrada = new Scanner(System.in);


        do {


            System.out.println("Introduce numeros positivos, podras introducir numeros hasta que pongas un numero menor o igual que 0");
            temp = entrada.nextInt();

            int tempLongitud = temp;
            do {
                 tempLongitud=tempLongitud/10;
                 longitud++;




            }while(tempLongitud != 0);
            System.out.println(longitud);



            if (longitud == sumaInterna) {

                sumaNumeros = sumaNumeros + String.valueOf(temp);
                numero = numero + temp;
                if (temp != 0) {
                    sumaNumeros = sumaNumeros + " + ";
                } else {
                    sumaNumeros = sumaNumeros + " = " + numero;

                }
            }
            longitud = 0;

        }while (0< temp);
        System.out.println(sumaNumeros);

    }
}

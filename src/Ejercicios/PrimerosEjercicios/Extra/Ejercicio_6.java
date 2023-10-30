package Ejercicios.PrimerosEjercicios.Extra;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {

        int n;

        int c1;
        int c2;
        int c3;
        int c4;
        int c5;


        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce numero de 5 cifras");
        n = entrada.nextInt();

        c1= n%10;
        c2=(n/10)%10;
        c3=(n/100)%10;
        c4=(n/1000)%10;
        c5=(n/10000)%10;
        System.out.println(c1);
        System.out.println(c1+""+c2);
        System.out.println(c1+""+c2+""+c3);
        System.out.println(c1+""+c2+""+c3+""+c4);
        System.out.println(c1+""+c2+""+c3+""+c4+""+c5);








    }
}

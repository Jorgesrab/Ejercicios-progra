package Parte_1.Ejercicios.PrimerosEjercicios.Ejercicios;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int a = 15;
        int b = -9;
        int c = 65;




        if (a%2==0) {
            System.out.println(a + " es par");
        } else {
            System.out.println(a + " es impar");
        }


        if (b<0) {
            System.out.println(b + " es negativo");
        } else {
            System.out.println(b + " es positivo");
        }



        if (c%2==0) {
            System.out.println(c+" es par");
        } else {
            System.out.println(c+" es impar");
        }


        if (c%5==0) {
            System.out.println(c+" es divisible entre 5");
        } else {
            System.out.println(c+" no es divisible entre 5");
        }


        if (c%10==0) {
            System.out.println(c+" es divisible entre 10");
        } else {
            System.out.println(c+" no es divisible entre 10");
        }



        if (c>100) {
            System.out.println(c+" es mayor que 100");
        } else {
            System.out.println(c+" es menor que 100");
        }

    }

}

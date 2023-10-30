package Ejercicios.EjerciciosCondicionales.Ejmeplos;

import java.util.Scanner;
/**
 * Ejemplo de de estructura condicional  IF-ELSE
 */
public class Ejemplo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce num1: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce num2: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El número mayor es " + num1);
        } else {
            System.out.println("El número mayor es " + num2);
        }

        //ahora quiero otro número
        System.out.println("Introduce num3: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num2) {
            System.out.println("El número mayor es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor es " + num3);
        } else {

            System.out.println("Son iguales");
        }




    }
}

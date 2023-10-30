package Ejercicios.EjerciciosCondicionales.Ejmeplos;

import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        int mesNumero = 0;
//Cuidado con las mayúsculas y minúscula, Java es case sensitive
// para evitar esto, es útil poner mes.toUpperCase();
// muy util ya que la gente lo escribe a veces en mayúsculas, a veces en minúsculas,...
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un mes: ");
        String mes= sc.nextLine().toLowerCase();
        switch (mes) {
            case "enero":
                mesNumero = 1;
                break;
            case "febrero":
                mesNumero = 2;
                break;
            case "marzo":
                mesNumero = 3;
                break;
            case "abril":
                mesNumero = 4;
                break;
            case "mayo":
                mesNumero = 5;
                break;
            case "junio":
                mesNumero = 6;
                break;
            case "julio":
                mesNumero = 7;
                break;
            case "agosto":
                mesNumero = 8;
                break;
            case "septiembre":
                mesNumero = 9;
                break;
            case "octubre":
                mesNumero = 10;
                break;
            case "noviembre":
                mesNumero = 11;
                break;
            case "diciembre":
                mesNumero = 12;
                break;
            default:
                mesNumero = 0;
                break;
        }
        System.out.println("El mes de " + mes + " se corresponde con el número " + mesNumero );
    }
}

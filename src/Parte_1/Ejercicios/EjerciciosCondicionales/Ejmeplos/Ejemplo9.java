package Parte_1.Ejercicios.EjerciciosCondicionales.Ejmeplos;

import java.util.Scanner;

public class Ejemplo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un mes (en número): ");
        int mes = sc.nextInt();
        int dias = switch (mes) {
            case 0, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 2 -> {
                yield 28;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            //Si hay una sola instrucción en el case, se puede obviar yield y { }
            // case 2 -> 28;
            // case 4, 6, 9, 11 -> 30;
            default -> {
                System.out.println("Mes incorrecto");
                yield -1; //hay que devolver algo
            }
        };

    }
}

package Ejercicios.EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        int pesoPaquete;
        int zona;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el peso del paquete en gramos");
        pesoPaquete = entrada.nextInt();
        System.out.println("Introduce la zona");
        zona = entrada.nextInt();

        int coste = switch (zona){
            case 1 -> 24;
            case 2 -> 20;
            case 3 -> 21;
            case 4 -> 10;
            case 5 -> 18;



            default -> throw new IllegalStateException("Valor invalido : " + zona);

        };

        if (pesoPaquete >5000){
            System.out.println("El paquete no puede ser transportado");
        }else {
        System.out.println("El coste es "+ pesoPaquete*coste);
        }


    }
}

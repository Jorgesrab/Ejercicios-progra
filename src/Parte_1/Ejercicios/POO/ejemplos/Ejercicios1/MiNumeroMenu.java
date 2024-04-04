package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

import java.util.Scanner;

public class MiNumeroMenu {
    public static String[] opciones = {"doble", "triple", "cuádruple"};
    public static void mostrarTituloEjercicio() {
        System.out.println("Introduce un número: ");
    }
    public static String TITULO_MENU = "Elige lo que quieres que haga:";

    public static void mostrarMenu(String[] opciones) {
        int i=1;
        System.out.println(TITULO_MENU);
        for (String opcion:opciones) {
            System.out.println(i + ") " +opcion);
            i++;
        }
        System.out.println("0) Salir");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarTituloEjercicio();
        double numero = sc.nextDouble();
        MiNumero miNumero= new MiNumero(numero);
        int opcion;
        do {
            mostrarMenu(opciones);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> System.out.println(miNumero.doble());
                case 2 -> System.out.println(miNumero.triple());
                case 3 -> System.out.println(miNumero.cuadruple());
                case 0 -> System.out.println("Fin del programa");
                default -> {
                    System.out.println("Opción incorrecta, prueba otra vez");
                }
            }
        } while(opcion!=0);
    }
}


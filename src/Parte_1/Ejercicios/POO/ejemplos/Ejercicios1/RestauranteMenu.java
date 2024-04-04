package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

import java.util.Scanner;

public class RestauranteMenu {
    public static String[] opciones = {"Añadir papas", "Mostrar papas", "Merma de papas",
            "Añadir chocos", "Mostrar chocos", "Merma de chocos", "Numero clientes atender"};
    public static void mostrarTituloEjercicio() {
        System.out.println("Ejercicio Restaurante");
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
        RestauranteAlmacen restaurante = new RestauranteAlmacen();
        int opcion;
        do {
            mostrarMenu(opciones);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce cantidad");
                    int papas = sc.nextInt();
                    restaurante.anyadirPapas(papas);
                }
                case 2 -> restaurante.mostrarPapas();
                case 3 -> {
                    System.out.println("Introduce cantidad");
                    int papas = sc.nextInt();
                    restaurante.mermaPapas(papas);
                }
                case 4 -> {
                    System.out.println("Introduce cantidad");
                    int chocos = sc.nextInt();
                    restaurante.anyadirChocos(chocos);
                }
                case 5 -> restaurante.mostrarChocos();
                case 6 -> {
                    System.out.println("Introduce cantidad");
                    int chocos = sc.nextInt();
                    restaurante.mermaChocos(chocos);
                }
                case 7 -> System.out.println(restaurante.clientesAtencion());
                case 0 -> System.out.println("Fin del programa");
                default -> {
                    System.out.println("Opción incorrecta, prueba otra vez");
                }
            }
        } while(opcion!=0);
    }
}

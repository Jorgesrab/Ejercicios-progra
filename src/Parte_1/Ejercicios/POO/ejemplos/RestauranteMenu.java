package Parte_1.Ejercicios.POO.ejemplos;

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
        RestauranteAlmacen restaurante = new RestauranteAlmacen(100.0, 125.0);
        int opcion;
        do {
            mostrarMenu(opciones);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce cantidad");
                    double papas = sc.nextDouble();
                    restaurante.anyadirPapas(papas);
                }
                case 2 -> restaurante.mostrarPapas();
                case 3 -> {
                    System.out.println("Introduce cantidad");
                    double papas = sc.nextDouble();
                    restaurante.mermaPapas(papas);
                }
                case 4 -> {
                    System.out.println("Introduce cantidad");
                    double choclos = sc.nextDouble();
                    restaurante.anyadirChoclos(choclos);
                }
                case 5 -> restaurante.mostrarChoclos();
                case 6 -> {
                    System.out.println("Introduce cantidad");
                    double choclos = sc.nextDouble();
                    restaurante.mermaChoclos(choclos);
                }
                case 7 -> System.out.println(restaurante.numeroClientes());
                case 0 -> System.out.println("Fin del programa");
                default -> {
                    System.out.println("Opción incorrecta, prueba otra vez");
                }
            }
        } while(opcion!=0);
    }

}

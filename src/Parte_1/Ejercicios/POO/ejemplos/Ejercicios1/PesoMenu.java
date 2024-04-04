package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

import java.util.Scanner;

public class PesoMenu {
    public static void mostrarTituloEjercicio() {
        System.out.println("Introduce un peso en kilos: ");
    }

    public static void mostrarMenu(String[] opciones) {
        int i=1;
        System.out.println("Elige a qué unidad lo convierto:");
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
        Peso miPeso= new Peso(numero);
        int opcion;
        do {
            mostrarMenu(Peso.LISTA_UNIDADES);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> System.out.println(miPeso.getPeso(Peso.LISTA_UNIDADES[0]));
                case 2 -> System.out.println(miPeso.getPeso(Peso.LISTA_UNIDADES[1]));
                case 3 -> System.out.println(miPeso.getPeso(Peso.LISTA_UNIDADES[2]));
                case 4 -> System.out.println(miPeso.getPeso(Peso.LISTA_UNIDADES[3]));
                case 5 -> System.out.println(miPeso.getPeso(Peso.LISTA_UNIDADES[4]));
                case 6 -> System.out.println(miPeso.getPeso(Peso.LISTA_UNIDADES[5]));
                case 7 -> System.out.println(miPeso.getPeso(Peso.LISTA_UNIDADES[6]));
                case 0 -> System.out.println("Fin del programa");
                default -> {
                    System.out.println("Opción incorrecta, prueba otra vez");
                }
            }
        } while(opcion!=0);
    }
}


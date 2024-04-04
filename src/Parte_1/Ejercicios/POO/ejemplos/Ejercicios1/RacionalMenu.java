package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

import java.util.Scanner;

public class RacionalMenu {
    public static final String[] OPCIONES = {"mostrar numeros", "sumar", "restar", "producto", "division", "comprueba igualdad:"};
    public static void mostrarTituloEjercicio() {
        System.out.println("Operaciones con racionales ");
    }

    public static Racional obtenerRacional(Scanner sc) {
        System.out.println("Introduce los datos de racional");
        System.out.println("Numerador: ");
        int numerador = sc.nextInt();
        System.out.println("Denominador: ");
        int denominador = sc.nextInt();
        Racional racional = new Racional();
        racional.asignaNumerador(numerador);
        racional.asignaDenominador(denominador);
        return racional;
    }
    public static void mostrarMenu() {
        int i=1;
        System.out.println("Elige la opción deseada:");
        for (String opcion:OPCIONES) {
            System.out.println(i + ") " +opcion);
            i++;
        }
        System.out.println("0) Salir");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarTituloEjercicio();
        Racional rac1 = obtenerRacional(sc);
        Racional rac2 = obtenerRacional(sc);
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Estos son los racionales:");
                    rac1.imprimir();
                    rac2.imprimir();
                }
                case 2 -> {
                    Racional resultado = rac1.suma(rac2);
                    System.out.println("Resultado: ");
                    resultado.imprimir();
                }
                case 3 -> {
                    Racional resultado = rac1.resta(rac2);
                    System.out.println("Resultado: ");
                    resultado.imprimir();
                }
                case 4 -> {
                    Racional resultado = rac1.producto(rac2);
                    System.out.println("Resultado: ");
                    resultado.imprimir();
                }
                case 5 -> {
                    Racional resultado = rac1.division(rac2);
                    System.out.println("Resultado: ");
                    resultado.imprimir();
                }
                case 6 -> System.out.println("racional1 " + (rac1.esIgual(rac2)?"=":"!=") + " racional2");
                case 0 -> System.out.println("Fin del programa");
                default -> {
                    System.out.println("Opción incorrecta, prueba otra vez");
                }
            }
        } while(opcion!=0);
    }
}

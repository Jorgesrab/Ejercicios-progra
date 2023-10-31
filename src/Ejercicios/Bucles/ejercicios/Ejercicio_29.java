package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_29 {
    public static void main(String[] args) {
        String nombreUsuario;
        String opcionMenu ="";
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Como te llamas?");
        nombreUsuario = entrada.nextLine();

        while (!opcionMenu.equals("salir")){

            System.out.println("\nBienvenido al menu de prueba "+nombreUsuario+"\n\nIntroduce tu asignatura favirita entre las siguientes opciones:");
            System.out.println("\n-Matematicas\n-Lengua\n-Fisica\n-Ingles\n\n-Introduce \"Salir\" para salir");
            opcionMenu = entrada.nextLine();
            opcionMenu=opcionMenu.toLowerCase();

            switch (opcionMenu){

                case "matematicas", "fisica", "lengua", "ingles" ->{
                    System.out.println("--------------------------------------------------------");
                    System.out.println("|Feñicidades "+nombreUsuario+" tu asugnatura favorita es "+opcionMenu+"|");
                    System.out.println("--------------------------------------------------------");
                }

                case "salir" -> System.out.println("Programa terminado");
                default -> System.out.println("has introducido la opcion mal");
            }





        }


    }
}

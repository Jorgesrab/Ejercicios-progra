package PrimerosEjercicios.Ejercicios;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Ruleta_rusa {
    public static void main(String[] args) {

        String J1;
        String J2;
        int m = 1;
        int cont1 = 0;
        int cont2 = 0;



        int b;//Capacidad del cargador

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenidos a la ruleta rusa");

        System.out.println("Jugador 1");
        J1 = entrada.nextLine();


        System.out.println("Jugador 2");
        J2 = entrada.nextLine();


        System.out.println("Capacidad del cargador");
        b = entrada.nextInt();


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean bucle= true;
        while (bucle == true) {
            ArrayList<Integer> numerosDisponibles = new ArrayList<>();


            for (int i = 1; i <= (b); i++) {
                numerosDisponibles.add(i);
            }

            int numeroAleatorio;
            while (true) {

                System.out.println("Tu turno " + J1 + "\n");
                scanner.nextLine();

                int indiceAleatorio = random.nextInt(numerosDisponibles.size());
                numeroAleatorio = numerosDisponibles.get(indiceAleatorio);

                // Mostrar el número aleatorio
                if (numeroAleatorio != 1) {
                    System.out.println("Sigues vivo\n");
                } else {
                    System.out.println("Has muerto\n");
                   cont2 = cont2 +1  ;
                }

                // Eliminar el número de la lista para que no se repita
                numerosDisponibles.remove(indiceAleatorio);
                if (numeroAleatorio == 1) {
                    break;
                }


                System.out.println("Tu turno " + J2 + "\n");
                scanner.nextLine();

                indiceAleatorio = random.nextInt(numerosDisponibles.size());
                numeroAleatorio = numerosDisponibles.get(indiceAleatorio);

                if (numeroAleatorio != 1) {
                    System.out.println("Sigues vivo\n");
                } else {
                    System.out.println("Has muerto\n");
                    cont1 = cont1 +1;

                    numerosDisponibles.remove(indiceAleatorio);
                    if (numeroAleatorio == 1) {
                        break;
                    }


                }


            }
            entrada.nextLine();
            String ronda;
            System.out.println("Puntos\n "+ J1+ " " + cont1+ ("\n"+ J2 +" "+ cont2  ));
            System.out.println("Quieres jugar otra ronda? si/no");

            ronda = entrada.nextLine().toLowerCase();
            switch (ronda){
                case "yes" ->{}
                case  "no" ->bucle = false;
            }


        }


    }
}
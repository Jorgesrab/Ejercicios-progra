package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_26 {
    public static void main(String[] args) {
        int numeroTrabajadores;
        double pagoHora;

        int horasTotales=0;
        double pago;
        Scanner entrada = new Scanner(System.in);
        double temp=0;

        do {


            System.out.println("Intrduce el numero de trabajadores");
            numeroTrabajadores = entrada.nextInt();

            if (numeroTrabajadores <= 0) {
                System.out.println("\nEl numero de trabajadore debe ser mayor que 0 vuelva a intentarlo\n");
            }
        }while (numeroTrabajadores<=0);

        for (int i = 1; i <=numeroTrabajadores ; i++) {

            do {

                System.out.println("Introduce lo que se cobra por hora el trabajador " + i);
                pagoHora = entrada.nextInt();
                if (pagoHora<=0){
                    System.out.println("\nEl sueldo debe ser mayor de 0\n");
                }
            }while (pagoHora<=0);

            String dia = "";
            for (int j = 1; j <= 7; j++) {


                switch (j) {
                    case 1 -> dia = "Lunes";
                    case 2 -> dia = "Martes";
                    case 3 -> dia = "Miercoles";
                    case 4 -> dia = "Jueves";
                    case 5 -> dia = "Viernes";
                    case 6 -> dia = "Sabado";
                    case 7 -> dia = "domingo";
                }
                int horasTrabajadas;

                do {


                    System.out.println("Introduce las horas trabajadas el " + dia);
                    horasTrabajadas = entrada.nextInt();
                    if (horasTrabajadas<0){
                        System.out.println("\nlas horas trabajadas tienen que ser mayor o igual que 0\n");
                    }

                }while (horasTrabajadas<0);
                horasTotales = horasTotales + horasTrabajadas;



            }

            pago = horasTotales*pagoHora;
            System.out.println("\n\nEltrabajador "+i+" ha trabajado "+horasTotales+ " horas y cobrara "+pago+" euros\n\n");
            temp= temp + pago;
            horasTotales =0;
        }
        System.out.println("La empresa pagara "+temp+" euros por los "+numeroTrabajadores+" trabajadores");
    }
}

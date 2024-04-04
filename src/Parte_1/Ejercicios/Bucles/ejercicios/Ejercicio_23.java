package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_23 {
    public static void main(String[] args) {
        int horasTrabajadas=0;
        double sueldoPorHora;
        String dia = "";
        int temp;


        Scanner entrada = new Scanner(System.in);


        do {


            System.out.println("Introduce cuanto ganas por hora");
            sueldoPorHora = entrada.nextDouble();
            if (sueldoPorHora<=0){
                System.out.println("El sueldo no puede ser negativo ni cero");
            }
        }while (sueldoPorHora<=0);

        for (int diaSemana = 1; diaSemana <=6; diaSemana++) {
            switch (diaSemana){
                case 1 -> dia = "Lunes";
                case 2 -> dia = "Martes";
                case 3 -> dia = "Miercoles";
                case 4 -> dia = "Jueves";
                case 5 -> dia = "Viernes";
                case 6 -> dia = "Sabado";


            }
            do {


                System.out.println("Introduce las horas trabajadas el " + dia);
                temp = entrada.nextInt();


                if (temp<0){
                    System.out.println("No puedes introducir horas negativas vuelve a intentarlo");

                }else {
                    horasTrabajadas = temp + horasTrabajadas;
                }
            }while (temp<0);
        }
        System.out.println("Has trabajado "+horasTrabajadas+ " y vas a cobrar "+horasTrabajadas*sueldoPorHora+ " euros");
    }
}

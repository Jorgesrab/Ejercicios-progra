package Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int dia;
        int mes;
        int año;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el dia");
        dia = entrada.nextInt();
        System.out.println("Introduce el mes");
        mes= entrada.nextInt();
        System.out.println("Introduce el año");
        año = entrada.nextInt();

        boolean correcta =  fechaCorrecta(dia,mes,año);
        if (correcta== true){
            System.out.println("La fecha introducida es correcta");
        }else{
            System.out.println("La fecha introducida es incorrecta");

        }

    }

    private static boolean fechaCorrecta(int dia, int mes, int año) {
        boolean correcta;

        if (dia >=1 && dia <=30) correcta = true;
        else {
            correcta = false;
            return correcta;
        }
        if (mes >=1 && mes <=12) correcta = true;
        else {
            correcta = false;
            return correcta;
        }
        if (año >=10 && año <=3000) correcta = true;
        else {
            correcta = false;
            return correcta;
        }
        return correcta;



    }
}

package EjerciciosCondicionales._5Pensar;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int nota;
        int edad;
        String sexo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nota");
        nota = entrada.nextInt();
        System.out.println("Introduce tu edad");
        edad = entrada.nextInt();
        System.out.println("Introduce tu sexo (M/F)");
        entrada.nextLine();
        sexo = entrada.nextLine();
        sexo= sexo.toUpperCase();
        if (nota >=5 && edad >= 18 && (sexo.equals("F") || sexo.equals("M"))) {
            System.out.println("Estas admitido");
        }else{
            System.out.println("No estas admitido");
        }
    }
}

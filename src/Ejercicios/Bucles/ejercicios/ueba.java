package Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class ueba {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num,contador = 0,contadorNumString = 0,aux = 0,auxCifras,auxSuma=0;
        String sumaString = "";

        System.out.println("Introduce un número entero. " +
                "Podrás introducirlos hasta que pongas un cero");

        do {
            contador = 0;
            auxSuma = 0;
            num = sc.nextInt();
            sc.nextLine();
            auxCifras = num;

            do {
                auxCifras/= 10;
                contador++;

            }while (auxCifras != 0);

            //System.out.println("Contador cifras: " + contador);

            //Math.pow segun el número de cifra con base 10 y exponente i.
            for (double i = 1; i <= contador; i++){
                if(i == 1)
                    auxSuma += (int) (num%(Math.pow(10,1)));
                else
                    auxSuma += (int) (num%(Math.pow(10,i))/Math.pow(10,(i-1)));
            }
            //System.out.println("Aux suma: " + auxSuma);
            if (num == 0)
                System.out.print(sumaString + " = " + aux);
            else if (auxSuma == contador) {
                aux += num;
                if (contadorNumString == 0) {
                    sumaString = sumaString + String.valueOf(num);
                    contadorNumString++;
                }else {
                    sumaString = sumaString + " + " + num;
                    contadorNumString++;
                }
                System.out.println("Introduce otro número");
            } else
                System.out.println("Introduce otro número");




        } while (num != 0);
    }
}

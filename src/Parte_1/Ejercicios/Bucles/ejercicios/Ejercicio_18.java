package Parte_1.Ejercicios.Bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        int limSuperior;
        int limInferior;

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Introduce el limite superior");
            limSuperior = entrada.nextInt();
            System.out.println("Introduce el limite inferior");
            limInferior = entrada.nextInt();

            if ( limInferior >= limSuperior) {
                System.out.println("Error el limite superior debe ser mayor ");
            }

        }while (limInferior>=limSuperior);

        int numFuera = 0;
        int temp=0;

        String coincide= "No coincide ningun numero";
        int aux = 1;
        while (aux != 0) {
            System.out.println("introduce un numero distinto de 0 o introduce 0 para continuar ");
            aux = entrada.nextInt();

            if ((aux < limInferior || aux > limSuperior) && aux !=  0){
                numFuera++;



            }else if (aux == limSuperior || aux == limInferior){
                coincide = "hay uno o mas numeros que coinciden con el limite del intervalo ";

            } else if (aux > limInferior || aux < limSuperior) {
                temp = temp + aux;

            }


        }








        System.out.println("la suma de los numeros que estan dentro del intervalo es "+ temp);
        System.out.println(coincide);
        if (numFuera>0) {
            System.out.println("has introducido " + numFuera + " numeros fuera");
        }

    }
}

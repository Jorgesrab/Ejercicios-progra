package Parte_1.Ejercicios.Funciones;

import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce un numero");
        numero = entrada.nextInt();
        String numeroBinario= coversorBinario(numero);
        System.out.println(numeroBinario);

    }
    private static String coversorBinario(int numero){

        String binario="";
        int longitud=0;

        while (numero>=1){
            if(numero%2 != 0){
                binario+="1";


            }else {
                binario+="0";
            }

            numero=numero/2;

            longitud+=1;
        }
        int binarioInt = Integer.parseInt(binario);
        binario="";
        for (int i = 0; i < longitud; i++) {

            binario=binario+binarioInt%10;
            binarioInt=binarioInt/10;
        }


        return binario;
    }
}

package bucles.ejemplosTeoriaBucles;

import java.util.Scanner;

public class Ejemplo11Return {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        int resultado = multiplicar(numero);
        System.out.println("El resultado es: "+ resultado);
    }
    //FUNCIÓN multiplicar
    private static int multiplicar(int num) {
        int res = num * 10;
        return res;
    }
}

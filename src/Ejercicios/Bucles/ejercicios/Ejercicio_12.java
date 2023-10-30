package Ejercicios.Bucles.ejercicios;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (sum + i <= 125) {
            sum += i;
            i++;
        }
        System.out.println("El primer número natural para el cual la suma de él más sus números anteriores es mayor a 125 es " + i);
    }
}


package Ejercicios.Bucles.Ejemplos;

public class Ejemplo6Bucles {
    public static void main(String[] args) {
        //EJEMPLO DE BUCLE INFINITO
        int i=1; //la variable i empieza en 1
        while (i < 6) {
            System.out.println(i);
            i--; // siempre va a cumplir la condición del bucle...nunca saldrá
        }
    }
}

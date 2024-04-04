package Parte_1.Ejercicios.PrimerosEjercicios.Ejemplos;

public class Ejemplo7 {
    public static void main(String[] args) {
        //OPERADORES RELACIONALES
        int precio1 = 10;
        int precio2 = 30;
        boolean barato = precio1 > precio2; //false
        boolean iguales1 = 40 == (precio1 + precio2); //true
        boolean iguales2 = 40 == precio1 + precio2; //true
        //  boolean iguales2 = (40 == precio1) + precio2; //ERROR
        boolean distintos = precio1 != precio2; //true

        //COMPARANDO STRING
        String nombre1 = "Pepe";
        String nombre2 = "Jose";
        String nombre3 = "pepe";
        boolean iguales10 = nombre1.equals(nombre2); //false
        boolean iguales20 = nombre1.equals(nombre3); //false
        boolean iguales30 = nombre1.equalsIgnoreCase(nombre3); //true



    }
}

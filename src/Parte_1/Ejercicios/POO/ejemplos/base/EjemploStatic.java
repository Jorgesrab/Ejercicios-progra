package Parte_1.Ejercicios.POO.ejemplos.base;

import java.util.Random;

public class EjemploStatic {
    private String cadena = "Esto es EjemploStatic.cadena";
    public static int valor;
    public static String testStatic() {
        // Puedo acceder a atributos estáticos
        System.out.println("Valor: " + valor);
        // No puedo acceder a otros atributos: error de compilación
//        System.out.println(cadena);
        return "valor: " + valor;
    }
    public static int numeroAzar() {
        Random ran = new Random();
        return ran.nextInt();
    }
}

class TestStatic {
    public static void main(String[] args) {
        int entero = EjemploStatic.numeroAzar();
        System.out.println("El numero es: " + entero);
        System.out.println(EjemploStatic.testStatic());
    }
}
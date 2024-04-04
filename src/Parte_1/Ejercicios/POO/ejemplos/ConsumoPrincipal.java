package Parte_1.Ejercicios.POO.ejemplos;

import java.util.Scanner;

/**
 * Clase para probar el ejercicio de Consumo
 */
public class ConsumoPrincipal {

    public static void main(String[] args) {
        // 1. Crear un objeto de la clase consumo con el constructor por defecto.
        Consumo consumo1 = new Consumo();
        // (habrá que pedir esos datos previamente por pantalla).
        Scanner sc = new Scanner(System.in);
        System.out.println("Clase Consumo, introduce los siguientes datos");
        System.out.println("Kilómetros: ");
        double kms = sc.nextDouble();
        System.out.println("Litros: ");
        double litros = sc.nextDouble();
        System.out.println("Velocidad media: ");
        double vMed = sc.nextDouble();
        System.out.println("Precio de la gasolina: ");
        double pGas = sc.nextDouble();
        // 2. Crear un objeto de la clase consumo con el constructor que recibe parámetros de entrada
        Consumo consumo2 = new Consumo(kms,litros, vMed, pGas);
        // 3. Con el segundo objeto, llamar al método Tiempo y sacar el resultado por pantalla.
        System.out.println("Consumo2.tiempo(): " + consumo2.tiempo());

        // 4. Con el segundo objeto, llamar al método consumoMedio y sacar el resultado por pantalla.
        System.out.println("consumo2.consumoMedio: " + consumo2.consumoMedio());

        // 5. Con el segundo objeto, llamar al método consumoEuros y sacar el resultado por pantalla.
        System.out.println("consumo2.consumoEuros: " + consumo2.consumoEuros());

        // 6 Más cosas
        // Usar los metodos set para modificar los atributos
        consumo1.setKms(1200);
        consumo1.setLitros(50);
        consumo1.setVMed(95);

        System.out.println("consumo1.kms : " + consumo1.getKms());
        System.out.println("consumo1.litros : " + consumo1.getLitros());
        System.out.println("consumo1.pGas : " + consumo1.getPGas());
        System.out.println("consumo1.vMed : " + consumo1.getVMed());

    }
}

package Parte_1.Ejercicios.Bucles.Ejemplos;

/*
Programa que imprima del 1 al 10
 */
public class Ejemplo1Bucles {
    public static void main(String[] args) {
        int contador = 1; //variable que declaramos e inicializamos fuera del bucle
        while (contador < 11) { //este bucle va a imprimir el valor de la variable
            // contador y tras imprimir y volver al
            //inicio del bucle, incrementa el contador
            System.out.println("Contador vale: " + contador);
            contador++; //si no incrementamos al final del bucle, se hace un bucle infinito
            //PROBAR A COMENTAR LA LINEA ANTERIOR PARA VER EL BUCLE INFINITO
        }
        //Si no usáramos el bucle tendríamos que hacer System.out... 10 veces
        //imaginad en un programa grande
    }
}

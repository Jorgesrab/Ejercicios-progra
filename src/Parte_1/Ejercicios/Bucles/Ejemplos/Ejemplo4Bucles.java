package Parte_1.Ejercicios.Bucles.Ejemplos;

public class Ejemplo4Bucles {
    // Es muy importante conocer el orden de ejecución de las instrucciones en un bucle for.
    public static void main(String[] args) {
        //bucle for que empieza en i=6 y acaba cuando i=0
        // en cada iteración, i se decrementa en 2 unidades
        for (int i=6; i>0; i-=2) {
            i=i+1;
            System.out.println(i);
        }
        // System.out.println(i); //ERROR
    }
}

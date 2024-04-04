package Parte_1.Ejercicios.Bucles.Ejemplos;

/*
ÁMBITO
 */
public class Ejemplo8Bucles {
    public static void main(String[] args) {
        for(int j = 1; j <= 10; j++) {
            System.out.print(j);
        }
        // j = 3; //error

        int j = 1;
        for(j = 2; j <= 10; j++){
            System.out.print(j);
        }
        j = 3; //ok

        int a = 10;
        if (a < 20) {
            int b = 90;
        }
        // b++; //error, b se declara dentro del bloque
//desde fuera no es visible, no se puede acceder a ella





    }
}

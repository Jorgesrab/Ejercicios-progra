package Ejercicios.PrimerosEjercicios.Ejercicios;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 3;
        int d = 9;
        int A = a;
        int B = b;
        int C = c;
        int D = d;



        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        System.out.println("c = "+ d);

        B = c;
        System.out.println("b toma el valor de c y pasa a valer " + B);
        C = a;
        System.out.println("c toma el valor de a y pasa a valer " + C);
        A=d;
        System.out.println("a toma el valor de d y pasa a valer " + A);
        D=b;
        System.out.println("d toma el valor de b y pasa a valer " + D);
    }
}

package EjerciciosCondicionales._3CondicionalesAnimados;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        double x2;// a
        double x1;// b
        double indep; //c

        Scanner entrada = new Scanner(System.in);


        System.out.println("introduce el valor de x2 cuadrado");
        x2 = entrada.nextDouble();

        System.out.println("introduce el valor de x");
        x1 = entrada.nextDouble();

        System.out.println("introduce el termino independiente");
        indep = entrada.nextDouble();

        double raiz;
        double intRaiz;
        raiz = Math.sqrt(Math.pow(x1,2)+(-4*x2*indep));
        intRaiz = (Math.pow(x1,2)+(-4*x2*indep));


        if (intRaiz < 0) {
            System.out.println("No existen soluciones reales");
        } else if (intRaiz==0) {
            System.out.println(-x1/(2*x2));

        } else if (intRaiz > 0){
            System.out.println((-x1+raiz)/(2*x2));
            System.out.println((-x1-raiz)/(2*x2));

        }

    }
}

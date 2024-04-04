package Parte_1.Ejercicios.PrimerosEjercicios.Ejemplos;

public class Ejemplo6 {
    public static void main(String[] args) {
        float f = 0.25f; //Precisión simple
        double Pi = Math.PI;  //Precisión doble

        //OPERADORES NUMÉRICOS
        int x = 7;
        int y = 5;
        //Suma
        int z = x + y;
        System.out.print("Suma ");
        System.out.println(z);
        //Resta
        z = x - y;
        System.out.print("Resta ");
        System.out.println(z);
        //Multiplicación
        z = x * y;
        System.out.print("Multipliación ");
        System.out.println(z);
        //División (entera) nos da el cociente de la división
        z = x / y;
        System.out.print("División entera ");
        System.out.println(z);
        //División (no entera)
        double j = Pi/f;
        System.out.println("División con decimales ");
        System.out.println(j);
        //Resto de división
        z = x % y;
        System.out.print("Módulo o resto ");
        System.out.println(z);

        //Incremento
        x++;
        System.out.println("Incremento de x ");
        System.out.println(x);
        //Decremento
        x--;
        System.out.println("Decremento de x");
        System.out.println(x);

        //MÁS EJEMPLOS
        int a = 3, b = 2;
        float f1 = 3f, f2 = 2f;
        System.out.println("3 + 2 = "+a+b); // 3 + 2 = 32
        System.out.println("3 + 2 = "+(a+b)); // 3 + 2 = 5
        System.out.println(a+" + "+b+" = "+(a+b)); // 3 + 2 = 5
        System.out.println(a+" - "+b+" = "+(a-b)); // 3 - 2 = 1
        System.out.println(a+" x "+b+" = "+(a*b)); // 3 x 2 = 6
        System.out.println(a+" / "+b+" = "+(a/b)); // 3 / 2 = 1
        System.out.println(f1+" / "+f2+" = "+(f1/f2)); // 3.0 / 2.0 = 1.5
        System.out.println(a+" / "+f2+" = "+(a/f2)); // 3 / 2.0 = 1.5
        System.out.println(b+" % "+a+" = "+(b%a)); // 2 % 3 = 2
        System.out.println(f2+" % "+f1+" = "+(f2%f1)); // 2.0 % 3.0 = 2.0








    }
}

package Parte_1.Ejercicios.POO.ejemplos.base;

public class Triangulo {
    // Miembros o Atributos
    double base=0.0;
    double altura=0.0;

    //Constructor con parámetros de entrada
    Triangulo (double laBase, double laAltura){
        base=laBase;
        altura=laAltura;
    }

    // método para calcular el área
    //No recibe parámetros ni devuelve datos
    public double area() {
        double area = (base*altura)/2;
        return area;
    }

    public static void main(String[] args) {
        double resultado;
        Triangulo t1 = new Triangulo(2.0, 3.0);
        Triangulo t2 = new Triangulo(4.0, 7.0);

        System.out.println(t1.area()); // Area 3.0
        resultado = t2.area(); // Area 14.0
        System.out.println("El área de t2 es: " + resultado); // Area 3.0
    }
}
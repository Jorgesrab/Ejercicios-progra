package Parte_1.Ejercicios.POO.ejemplos;
// clase Triangulo
public class Triangulo {
    // Miembros o Atributos
    double base=0.0;
    double lado1=0.0;
    double lado2=0.0;
    double altura=0.0;

    //Constructor con parámetros de entrada
    Triangulo (double base, double lado1, double lado2, double altura){
        this.base =base;
        this.lado1 =lado1;
        this.lado2 =lado2;
        this.altura =altura;
    }

    // método para calcular el área
    //No recibe parámetros ni devuelve datos
    public void area() {
        double area = (base*altura)/2;
        System.out.println(area);
    }

    // método para calcular el perímetro
    //No recibe parámetros pero devuelve un dato Double
    public double perimetro() {
        double perimetro = base+lado1+lado2;
        return perimetro;
    }

}

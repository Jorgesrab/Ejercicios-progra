package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

public class Punto {
    //1. Atributos
    private double x;
    private double y;
    // 2. Constructor
    public Punto(double a, double b) {
        x=a;
        y=b;
    }
    // 3. Métodos
    // 3.1 getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    // 3.2 setters
    public void setX(double a) {
        x=a;
    }
    public void setY(double b) {
        y=b;
    }
    // 3.3 Otros metodos
    public boolean igual(Punto p1){
        return x == p1.x && y == p1.y;
    }

    public double distancia(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public double distancia(Punto otro) {
        double distancia = Math.sqrt( Math.pow(otro.x-x,2) + Math.pow(otro.y - y,2) );
        return distancia;
    }
}

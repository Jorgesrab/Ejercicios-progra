package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

public class PuntoPrincipal {
    public static void main(String[] args) {
        Punto p1 = new Punto(1.0, 5.0);
        System.out.println("Punto p1. x=" + p1.getX() + ", y=" + p1.getY());
        p1.setX(1.55);
        p1.setY(-1.45);
        System.out.println("Punto p1. x=" + p1.getX() + ", y=" + p1.getY());

        Punto p2 = new Punto(-1, 10);
        Punto p3 = new Punto(1.55, -1.45);
        Punto p4 = p2;
        System.out.println("Punto p2. x=" + p2.getX() + ", y=" + p2.getY());
        System.out.println("¿p1.igual(p2)? " + p1.igual(p2));
        System.out.println("Punto p3. x=" + p3.getX() + ", y=" + p3.getY());
        System.out.println("¿p1.igual(p3)? " + p1.igual(p3));
        System.out.println("¿p1 == p3? " + (p1 == p3));
        System.out.println("¿p2.igual(p4)? " + p2.igual(p4));
        System.out.println("¿p2 == p4? " + (p2 == p4));

        System.out.println("p1.distancia()= " + p1.distancia());
        System.out.println("p1.distancia(p2)= " + p1.distancia(p2));
        System.out.println("p1.distancia(p3)= " + p1.distancia(p3));

    }
}

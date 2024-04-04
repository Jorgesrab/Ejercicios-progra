package Parte_1.Ejercicios.POO.ejemplos.Ejercicios2;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(1,1,5,11);
        rec1.setNombre("rec1");
        mostrarRectangulo(rec1);
        // iguales NO
        Rectangulo rec2 = new Rectangulo(-1,3,2,7);
        rec2.setNombre("rec2");
        mostrarRectangulo(rec2);
        System.out.println("Iguales 1 y 2" + rec1.equals(rec2));
        // iguales SI
        Rectangulo rec3 = new Rectangulo(-1,3,2,7);
        rec3.setNombre("rec3");
        mostrarRectangulo(rec3);
        System.out.println("Iguales 2 y 3: " + rec2.equals(rec3));
        // Mover
        rec3.mover(-2,-3);
        mostrarRectangulo(rec3);
        System.out.println("Iguales 2 y 3: " + rec2.equals(rec3));

        Rectangulo rec4 = rec3.desplazado(2,3);
        rec4.setNombre("rec4");
        mostrarRectangulo(rec4);

        Rectangulo rec5 = rec4.aumentaAltura(3);
        rec5.setNombre("rec5");
        mostrarRectangulo(rec5);

        Rectangulo rec6 = rec4.aumentaBase(2);
        rec6.setNombre("rec6");
        mostrarRectangulo(rec6);
    }
    // mostrar: toString, base, altura, perimetro, area, diagonal
    private static void mostrarRectangulo(Rectangulo rec1) {
        System.out.println(rec1);
        System.out.println("Base: " + rec1.getBase());
        System.out.println("Altura: " + rec1.getAltura());
        System.out.println("Perimetro: " + rec1.getPerimetro());
        System.out.println("Area: " + rec1.getArea());
        System.out.println("Diagonal: " + rec1.getDiagonal());
        System.out.println();
    }
}

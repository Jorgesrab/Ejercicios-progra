package Parte_2.Ejercicios_pooAvanzado.Ejercicio8_Figuras;

public class Cuadrado implements iFigura2D {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return this.lado*4;
    }

    @Override
    public double area() {
        return this.lado*this.lado;
    }

    @Override
    public void escalar(double escalar) {
        if (escalar>0){
            this.lado=this.lado*escalar;
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Cuadrado: --> Lado: "+this.lado+" Perimetro: "+this.perimetro()+ " Area: "+this.area());

    }
}

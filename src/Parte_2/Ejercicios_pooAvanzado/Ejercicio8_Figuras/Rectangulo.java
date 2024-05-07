package Parte_2.Ejercicios_pooAvanzado.Ejercicio8_Figuras;

public class Rectangulo implements iFigura2D{
    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double perimetro() {
        return (this.ancho*2)+(this.alto*2);
    }

    @Override
    public double area() {
        return this.ancho*this.alto;
    }

    @Override
    public void escalar(double escalar) {
        this.ancho*=escalar;
        this.alto*=escalar;

    }

    @Override
    public void imprimir() {
        System.out.println("Rectangulo: --> Ancho: "+this.ancho+" Alto:"+this.alto+" Perimetro: "+this.perimetro()+ " Area: "+this.area());

    }
}

package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

public class Complejo {
    double pReal;
    double pImag;
    public void asignar(double x, double y) {
        pReal = x;
        pImag = y;
    }
    public void sumar(Complejo b) {
        pReal += b.pReal;
        pImag += b.pImag;
    }
    public void imprimir() {
        System.out.println("Complejo { pReal: " + pReal + ", pImag: " + pImag + "}");
    }

}

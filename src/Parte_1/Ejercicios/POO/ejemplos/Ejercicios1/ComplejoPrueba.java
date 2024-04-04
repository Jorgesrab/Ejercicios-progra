package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

public class ComplejoPrueba {
    public static void main(String[] args) {
        Complejo a = new Complejo();
        Complejo b = new Complejo();

        a.asignar(3.45,2.15);
        b.asignar(2.15,-1e6);
        a.imprimir();
        b.imprimir();
        a.sumar(b);
        a.imprimir();
    }
}

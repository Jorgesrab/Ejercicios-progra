package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

public class Racional {
    int numerador;
    int denominador;
    public Racional() {
        denominador=1;
    }
    public void asignaNumerador(int numerador) {
        this.numerador = numerador;
    }
    public void asignaDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Racional=" + numerador + "/" + denominador ;
    }

    public Racional suma(Racional otro) {
        Racional nuevo = new Racional();
        nuevo.asignaDenominador(denominador* otro.denominador);
        nuevo.asignaNumerador(numerador*otro.denominador + otro.numerador*denominador);
        return nuevo;
    }
    public Racional resta(Racional otro) {
        Racional nuevo = new Racional();
        nuevo.asignaDenominador(denominador* otro.denominador);
        nuevo.asignaNumerador(numerador*otro.denominador - otro.numerador*denominador);
        return nuevo;
    }

    public Racional producto(Racional otro) {
        Racional nuevo = new Racional();
        nuevo.asignaNumerador(numerador*otro.numerador);
        nuevo.asignaDenominador(denominador*otro.denominador);
        return nuevo;
    }

    public Racional division(Racional otro) {
        Racional nuevo = new Racional();
        nuevo.asignaNumerador(numerador*otro.denominador);
        nuevo.asignaDenominador(denominador*otro.numerador);
        return nuevo;
    }

    public boolean esIgual(Racional otro) {
        return numerador * otro.denominador == denominador * otro.numerador;
    }
}

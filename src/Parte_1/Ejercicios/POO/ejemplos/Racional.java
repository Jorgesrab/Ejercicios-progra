package Parte_1.Ejercicios.POO.ejemplos;

public class Racional {
    int a; // numerador
    int b; // denominador

    public Racional() {
        b = 1;
    }

    public void asignaNumerador(int x) {
        a = x;
    }
    public void asignaDenominador(int y) {
        b = y;
    }
    public void imprimir(){
        System.out.println("Racional " + a + '/' + b);
    }
    public String toString(){
        return "Racional { numerador = "+ a + ", denominador = "+ b + " }";
    }

    public Racional suma(Racional rac2){
        // Calculo numerador y denominador del resultado
        int numerador = a*rac2.b + b*rac2.a; // multiplicar en cruz
        int denominador = b* rac2.b;
        // Nuevo Racional que es el resultado de la operación
        Racional resultado = new Racional();
        resultado.asignaNumerador(numerador);
        resultado.asignaDenominador(denominador);
        return resultado;
    }

    public static void main(String[] args) {
        Racional r1 = new Racional();
        r1.asignaNumerador(2);
        r1.asignaDenominador(3);
        Racional r2 = new Racional();
        r2.asignaNumerador(4);
        r2.asignaDenominador(5);
        r1.imprimir();
        r2.imprimir();
        Racional suma = r1.suma(r2);
        suma.imprimir();
    }
}

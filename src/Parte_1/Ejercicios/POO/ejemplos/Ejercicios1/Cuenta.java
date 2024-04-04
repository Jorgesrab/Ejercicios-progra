package Parte_1.Ejercicios.POO.ejemplos.Ejercicios1;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta {" +
                "saldo=" + saldo +
                '}';
    }
    public void mostrar() {
        System.out.println(toString());
    }
    public void ingresar(double cuanto) {
        if(cuanto<0) cuanto=0;
        saldo+=cuanto;
        System.out.println("Ingreso de " + cuanto +" realizado correctamente");
    }
    public void retirar(double cuanto) {
        if(cuanto<0) cuanto=0;
        saldo-=cuanto;
        System.out.println("Retirada de " + cuanto +" realizada correctamente");
    }
    public void transferencia(Cuenta c, double cuanto) {
        if(cuanto<0) cuanto=0;
        saldo-=cuanto;
        c.saldo+=cuanto;
        System.out.println("Transferencia de " + cuanto +" realizada correctamente");
    }

}

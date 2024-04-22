package Parte_2.Ejercicios_pooAvanzado.Ejercicio5_Banco;

public abstract class CuentaBancaria {
    private String iban;
    private double saldo;
    private static final double interes = 2.5;

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void ingresar(){

    }

}


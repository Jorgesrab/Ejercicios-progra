package Parte_2.Ejercicios_pooAvanzado.Ejercicio5_Banco;

public class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void calcularIntereses() {
        System.out.println("El saldo despues del interes aunal basico sera "+ (this.getSaldoS()+(this.getSaldoS()*(interes/100))));
    }
}

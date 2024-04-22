package Parte_2.Ejercicios_pooAvanzado.Ejercicio5_Banco;

public class CuentaAhorro extends CuentaBancaria{
    double saldoMinimo;

    public CuentaAhorro(String numeroCuenta, double saldo, double saldoMinimo) {
        super(numeroCuenta, saldo);
        this.saldoMinimo = saldoMinimo;
    }

    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void calcularIntereses() {

        if (this.saldoMinimo<this.getSaldoS()){
            System.out.println("El saldo tras el interes anual sera "+ (this.getSaldoS()+(this.getSaldoS()*(interes/100))));
        }else {

            System.out.println("El saldo tras el interes anual sera "+ (this.getSaldoS()+(this.getSaldoS()*(interes/100/2))));
        }

    }
}

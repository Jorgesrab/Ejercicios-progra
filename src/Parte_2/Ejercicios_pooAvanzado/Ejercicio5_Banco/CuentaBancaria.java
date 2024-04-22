package Parte_2.Ejercicios_pooAvanzado.Ejercicio5_Banco;

public abstract class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public static final double interes = 2.5;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void getnumeroCuenta() {
        System.out.println("Su iban es:return iban"+ this.numeroCuenta);;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void getSaldo() {
        System.out.println("Su saldo es de "+this.saldo); ;
    }
    public double getSaldoS() {
     return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void ingresar(double cantidad){
        if (cantidad>0){
            this.saldo+=cantidad;
            System.out.println("Ingreso correcto");
        }else System.out.println("Error:  no puede ingresar dinero negativo");
    }

    public void retirar(double cantidad){
        if (cantidad>0 && cantidad <= this.saldo){
            this.saldo-=cantidad;
            System.out.println("retirada correcta ");
        } else if (cantidad>this.saldo) {
            System.out.println("Saldo insuficiente");
        } else System.out.println("Error: no puede retirar dinero negativo");
    }

    public void traspaso( double cantidad,CuentaBancaria aTraspasar){

        if (cantidad>0 && cantidad<=this.saldo){
            this.saldo-=cantidad;
            aTraspasar.saldo+=cantidad;
            System.out.println("Transpaso realizado correctamente");
        } else if (cantidad>this.saldo) {
            System.out.println("Saldo insuficiento");
        }else {
            System.out.println("Error: no puede retirar dinero negativo");

        }

    }

    public void mostrar(){
        System.out.println("----------------------------------------------------");
        System.out.println("El numero de cuenta es "+this.numeroCuenta+
        "\n EL saldo es "+this.saldo);
        this.calcularIntereses();
        System.out.println("----------------------------------------------------");
    }
    public abstract void calcularIntereses();

}


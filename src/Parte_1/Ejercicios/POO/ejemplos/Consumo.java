package Parte_1.Ejercicios.POO.ejemplos;

public class Consumo {
    // 1. Atributos
    double kms;
    double litros;
    double vMed;
    double pGas;

    // 2. Constructores
    // 1º por defecto: sin parámetros
    public Consumo() {
        pGas = 1.49;
    }

    // 2º Constructor con parametros
    public Consumo(double kms, double litros, double vMed, double pGas) {
        this.kms = kms;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }
    // 3. Métodos
    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getVMed() {
        return vMed;
    }

    public void setVMed(double vMed) {
        this.vMed = vMed;
    }

    public double getPGas() {
        return pGas;
    }

    public void setPGas(double pGas) {
        this.pGas = pGas;
    }

    /*
     *  Indicará el tiempo empleado en realizar el viaje.
     */
    public double tiempo() {
        double tiempo = kms/vMed;
        return tiempo;
    }

    /*<
     * Consumo medio del vehículo (en litros cada 100 kilómetros).
     */
    public double consumoMedio() {
        double consumoMedio = litros * 100 / kms;
        return consumoMedio;
    }

    /*
     Consumo medio del vehículo (en euros cada 100 kilómetros).
     */
    public double consumoEuros() {
        double consumoEuros = pGas*consumoMedio();
        return consumoEuros;
    }


 }

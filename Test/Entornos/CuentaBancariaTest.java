package Entornos;

import Parte_1.Entornos.CuentaBancaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {

    public CuentaBancaria cuenta;
    @BeforeEach
    void setUp() {
       cuenta = new CuentaBancaria(1000);
    }

    @Test
    void depositar() {

        cuenta.depositar(100);
        assertEquals(1100,cuenta.consultarSaldo());


    }

    @Test
    void depositar1() {

        cuenta.depositar(-100);
        assertEquals(1000,cuenta.consultarSaldo());


    }


    @Test
    void retirar() {
        cuenta.retirar(100);
        assertEquals(900,cuenta.consultarSaldo());



    }

    @Test
    void retirar1() {

        cuenta.retirar(100);
        assertEquals(900,cuenta.consultarSaldo());


    }

    @Test
    void consultarSaldo() {

        assertFalse(cuenta.retirar(1100));
    }
}
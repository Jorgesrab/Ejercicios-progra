package Entornos;

import Parte_1.Entornos.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest extends Calculadora {

    public Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();


    }

    @Test
    void testSumar() {
        assertEquals(6,sumar(5,1));

    }

    @Test
    void testRestar() {
        assertEquals(0,restar(3,3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(9,multiplicar(3,3));

    }
}


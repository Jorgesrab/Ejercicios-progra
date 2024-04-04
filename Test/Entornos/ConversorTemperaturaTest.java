package Entornos;

import Parte_1.Entornos.ConversorTemperatura;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest{


    public ConversorTemperatura temp;

    @BeforeEach
    void setUp() {
        ConversorTemperatura  temp = new ConversorTemperatura();
    }

    @AfterEach
    void teardown() {
        temp = null;
    }

    @Test
    void celsiusAFahrenheit() {
        assertEquals(59, temp.celsiusAFahrenheit(15),0.01);

    }

    @Test
    void fahrenheitACelsius() {
        assertEquals(15, temp.fahrenheitACelsius(59),0.01);
    }
}
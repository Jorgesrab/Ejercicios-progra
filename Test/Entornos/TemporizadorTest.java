package Entornos;

import Parte_1.Entornos.Temporizador;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TemporizadorTest {

    private Temporizador temporizador;

    @BeforeEach
    void setUp() {
        temporizador = new Temporizador();
    }

    @Test
    void testTemporizadorNoIniciado() {
        // Verificar que el temporizador no se considera corriendo cuando se crea.
        assertFalse(temporizador.corriendo, "El temporizador no debería estar corriendo inicialmente.");
    }

    @Test
    void testIniciarTemporizador() {
        temporizador.iniciar();
        // Verificar que el temporizador se considera corriendo después de iniciar.
        assertTrue(temporizador.corriendo, "El temporizador debería estar corriendo después de iniciar.");
    }

    @Test
    void testResetearTemporizador() {
        temporizador.iniciar();
        temporizador.resetear();
        // Verificar que el temporizador no está corriendo y que el tiempo es reseteado.
        assertFalse(temporizador.corriendo, "El temporizador no debería estar corriendo después de resetear.");
        assertEquals(0, temporizador.tiempoTranscurrido(), "El tiempo transcurrido debería ser 0 después de resetear.");
    }

    @Test
    void testProbarTemporizador() throws InterruptedException {
        temporizador.iniciar();
        Thread.sleep(2000); // Simula la espera de 2 segundos
        temporizador.detener();
        // Verificar que el temporizador se ha detenido y que el tiempo es distinto de 0.
        assertFalse(temporizador.corriendo, "El temporizador no debería estar corriendo después de detener.");
        assertNotEquals(0, temporizador.tiempoTranscurrido(), "El tiempo transcurrido no debería ser 0 después de iniciar y detener.");
    }

    @AfterEach
    void tearDown() {
        temporizador.resetear();
    }
}
package recursos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LicuadoraTest {

    @Test
    public void testLlenar() {
        Licuadora licuadora = new Licuadora(1, 10.0);

        // Prueba de llenado dentro de la capacidad
        double volumenRestante = licuadora.llenar(9.5);
        assertEquals("La licuadora debería tener 9.5 litros.", 1.5, volumenRestante, 0.001);

        // Prueba de llenado excediendo la capacidad
        volumenRestante = licuadora.llenar(1.0);
        assertEquals("La licuadora no debería exceder su capacidad máxima de 10.0 litros.", 2.0, volumenRestante, 0.001);
    }

    @Test
    public void testIncrementarVelocidad() {
        Licuadora licuadora = new Licuadora(1, 10.0);

        // Incrementar velocidad dentro del rango
        int velocidadActual = licuadora.incrementarVelocidad();
        assertEquals("La velocidad debería ser 2 después de incrementar.", 2, velocidadActual);

        // Incrementar velocidad al máximo permitido
        licuadora.incrementarVelocidad(); // Incrementa a 3
        velocidadActual = licuadora.incrementarVelocidad(); // No debe exceder 3
        assertEquals("La velocidad no debería superar el valor máximo de 3.", 3, velocidadActual);
    }

    @Test
    public void testServir() {
        Licuadora licuadora = new Licuadora(1, 10.0);
        licuadora.llenar(1.5);

        // Prueba de servir dentro del volumen disponible
        double volumenRestante = licuadora.servir(1.0);
        assertEquals("Deberían quedar 0.5 litros después de servir 1.0 litros.", 0.5, volumenRestante, 0.001);

        // Prueba de servir más volumen del disponible
        volumenRestante = licuadora.servir(1.0);
        assertEquals("No debería quedar líquido después de servir más de lo disponible.", 0.0, volumenRestante, 0.001);
    }
}


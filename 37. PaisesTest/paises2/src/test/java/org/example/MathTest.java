package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathTest {
    MathOperations mathOperations = new MathOperations();
    @Test
    public void testAdd(){
        int resultadoSuma =mathOperations.add(5,2);
        assertEquals(7,resultadoSuma);
    }

    @Test
    public void testSubstract(){
        int resultadoResta =mathOperations.subtract(5,2);
        assertEquals(3,resultadoResta);
    }

    @Test
    public void testEsPositivo(){
        boolean resultadoResta =mathOperations.isPositive(5);
        assertTrue(resultadoResta);
    }
}

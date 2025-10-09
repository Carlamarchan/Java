package org.example;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class PaisTest {

    @Test
    public void paisNoVacio() {
        RuntimeException ex= assertThrows(RuntimeException.class, ()->{new Pais("");});
        assertEquals("El país no puede estar vacío",ex.getMessage());
    }
}

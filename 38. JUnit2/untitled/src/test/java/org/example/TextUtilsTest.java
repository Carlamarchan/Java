package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextUtilsTest {
    TextUtils utils = new TextUtils();

    @Test
    void testConcatenate() {
        assertEquals("HolaMundo", utils.concatenate("Hola", "Mundo"));
    }

    @Test
    void testGetLength() {
        assertEquals(5, utils.getLength("Carla"));
    }

    @Test
    void testContainsWordTrue() {
        assertTrue(utils.containsWord("Hola mundo", "mundo"));
    }

    @Test
    void testContainsWordFalse() {
        assertFalse(utils.containsWord("Hola mundo", "Java"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }

    @Test
    void testGetWordsArray() {
        String[] expected = {"Hello", "JUnit", "Test"};
        assertArrayEquals(expected, utils.getWordsArray());
    }

    @Test
    void testGetExactStringDifferentObjects() {
        String str1 = utils.getExactString();
        String str2 = utils.getExactString();
        assertEquals(str1, str2);              // mismo valor
        assertNotSame(str1, str2);             // pero diferentes objetos
    }

    @Test
    void testThrowIfNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            utils.throwIfNull(null);
        });
    }

    @Test
    void testThrowIfNullDoesNotThrow() {
        assertDoesNotThrow(() -> {
            utils.throwIfNull("Texto válido");
        });
    }

    @Test
    void testNotNull() {
        assertNotNull(utils.getExactString());
    }
}

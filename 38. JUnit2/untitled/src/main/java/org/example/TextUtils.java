package org.example;

public class TextUtils {

    public String concatenate(String a, String b) {
        return a + b;
    }

    public int getLength(String text) {
        return text.length();
    }

    public boolean containsWord(String sentence, String word) {
        return sentence.contains(word);
    }

    public String toUpperCase(String text) {
        return text.toUpperCase();
    }

    public String[] getWordsArray() {
        return new String[]{"Hello", "JUnit", "Test"};
    }

    public String getExactString() {
        return new String("Hello"); // devuelve un nuevo objeto
    }

    public void throwIfNull(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
    }

    //opción: probar assertNull o assertNotNull en este último
}
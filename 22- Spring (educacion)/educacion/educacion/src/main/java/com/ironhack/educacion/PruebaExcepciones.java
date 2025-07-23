package com.ironhack.educacion;

import java.io.FileNotFoundException;

public class PruebaExcepciones {

    public static void main(String[] args) throws FileNotFoundException {
        PruebaExcepciones.llamdaCheckedException1();
        PruebaExcepciones.llamdaCheckedException2();
        PruebaExcepciones.llamdaUncheckedException();
    }

    private static void llamdaUncheckedException() {
        throw new IndexOutOfBoundsException();
    }

    private static void llamdaCheckedException1() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            //TRATAR EXCEPCIÓN
        }
    }

    private static void llamdaCheckedException2() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}

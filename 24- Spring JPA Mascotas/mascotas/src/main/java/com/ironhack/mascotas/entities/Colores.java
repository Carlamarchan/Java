package com.ironhack.mascotas.entities;

public enum Colores {
    ROJO(255, 0, 0), VERDE(0, 255, 0), AZUL(0, 0, 255);
    int r;
    int g;
    int b;

    Colores(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
}

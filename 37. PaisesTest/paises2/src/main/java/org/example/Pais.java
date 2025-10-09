package org.example;

public class Pais {
    String nombrePais;

    public Pais() {
    }

    public Pais(String nombrePais)  {
        if (nombrePais.isBlank()){
            throw new RuntimeException("El país no puede estar vacío");
        }
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
}

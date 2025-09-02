package com.ironhack.mascotas.dtos.gato;

public class UpdateGatoDto {
    private String name;
    private int age;
    private String chipID;

    public UpdateGatoDto() {
    }

    public UpdateGatoDto(String name, int age, String chipID) {
        this.name = name;
        this.age = age;
        this.chipID = chipID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getChipID() {
        return chipID;
    }

    public void setChipID(String chipID) {
        this.chipID = chipID;
    }
}



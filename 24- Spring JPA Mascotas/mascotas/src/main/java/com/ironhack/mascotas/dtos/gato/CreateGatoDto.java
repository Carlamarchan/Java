package com.ironhack.mascotas.dtos.gato;

public class CreateGatoDto {
    private String name;
    private int age;
    private String image;
    private String chipID;

    public CreateGatoDto() {
    }

    public CreateGatoDto(String name, int age, String image, String chipID) {
        this.name = name;
        this.age = age;
        this.image = image;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getChipID() {
        return chipID;
    }

    public void setChipID(String chipID) {
        this.chipID = chipID;
    }
}

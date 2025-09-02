package com.ironhack.mascotas.dtos.gato;

public class GetGatoDto {
    private Long id;
    private String name;
    private int age;
    private String image;
    private String chipID;

    public GetGatoDto() {
    }

    public GetGatoDto(Long id, String name, int age, String image, String chipID) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.image = image;
        this.chipID = chipID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

package com.ironhack.mascotas.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "gato")
public class Gato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    @JsonIgnoreProperties(value = "listaDeGatos", allowSetters = true)
    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /*  {
        "name": "Dulce",
            "age": 4,
    }*/


}

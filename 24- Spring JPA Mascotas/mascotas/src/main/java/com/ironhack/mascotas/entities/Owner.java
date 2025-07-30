package com.ironhack.mascotas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String apellido;
    private int age;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Gato> listaDeGatos = new ArrayList<>();

    public Long getId() {
        return id;
    }
}


/*
{
        "name": "Carla",
        "apellido": "Marchán",
        "age": 32
        }*/

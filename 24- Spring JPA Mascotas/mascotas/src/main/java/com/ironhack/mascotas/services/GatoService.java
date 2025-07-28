package com.ironhack.mascotas.services;

import com.ironhack.mascotas.entities.Gato;
import com.ironhack.mascotas.repositories.GatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GatoService {
    @Autowired
    private GatoRepository gatoRepository;

    //Consultar todos los empleados
    public List<Gato> consultarGatos(){
        return (List<Gato>) gatoRepository.findAll();
    }

    //Buscar uno por ID
    public Optional<Gato> findById(Long id){
        return gatoRepository.findById(id);
    }

    //Registrar uno
    public Gato saveGato(Gato newGato){
        return gatoRepository.save(newGato);
    }
    //Eliminar uno
    public void deleteGato(Long id){
        gatoRepository.deleteById(id);
    }
}

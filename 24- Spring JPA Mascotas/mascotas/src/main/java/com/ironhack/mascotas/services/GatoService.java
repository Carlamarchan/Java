package com.ironhack.mascotas.services;

import com.ironhack.mascotas.dtos.gato.GetGatoDto;
import com.ironhack.mascotas.entities.Gato;
import com.ironhack.mascotas.mappers.GatoMapper;
import com.ironhack.mascotas.repositories.GatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GatoService {
    @Autowired
    private GatoRepository gatoRepository;
    @Autowired
    private GatoMapper gatoMapper;

    //Consultar todos los gatos
    public List<GetGatoDto> consultarGatos() {
        List<Gato> listaGatos = gatoRepository.findAll();
        return listaGatos.stream()
                .map(gato -> gatoMapper.entityToGetGatoDto(gato))
                .toList();
    }

    //Buscar uno por ID
    public Optional<Gato> findById(Long id) {
        return gatoRepository.findById(id);
    }

    //Guardar uno
    public Gato saveGato(Gato newGato) {
        return gatoRepository.save(newGato);
    }

    //Eliminar uno
    public void deleteGato(Long id) {
        gatoRepository.deleteById(id);
    }
}

package com.ironhack.mascotas.services;

import com.ironhack.mascotas.entities.Direction;
import com.ironhack.mascotas.repositories.DirectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectionService {
    @Autowired
    private DirectionRepository directionRepository;

    //Consultar las direcciones
    public List<Direction> getAllDirections(){
        return (List<Direction>) directionRepository.findAll();
    }

    //Buscar dirección por ID
    public Optional<Direction> getDirectionById(Long id){
        return directionRepository.findById(id);
    }

    //Guardar dirección
    public Direction saveDirection(Direction direction){
        return directionRepository.save(direction);
    }

    //Eliminar dirección
    public void eliminarDirection(Long id){
        directionRepository.deleteById(id);
    }
}

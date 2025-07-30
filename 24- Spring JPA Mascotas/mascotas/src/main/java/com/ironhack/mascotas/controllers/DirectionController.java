package com.ironhack.mascotas.controllers;

import com.ironhack.mascotas.entities.Direction;
import com.ironhack.mascotas.services.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/directions")
public class DirectionController {
    @Autowired
    private DirectionService directionService;

    //Trae todas las direcciones
    @GetMapping
    private List<Direction> listaDeDirecciones(){
        return directionService.getAllDirections();
    }

    //Trae una dirección por ID
    @GetMapping("/{id}")
    private Optional<Direction> getDirectionById(@PathVariable Long id){
        return directionService.getDirectionById(id);
    }

    //Guarda una dirección
    @PostMapping
    private  Direction saveDirection(@RequestBody Direction direction){
        return directionService.saveDirection(direction);
    }

    //Borra una dirección
    public ResponseEntity<Void> deleteDirection(@PathVariable Long id){
        if (id!=null){
            directionService.eliminarDirection(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }

    }
}

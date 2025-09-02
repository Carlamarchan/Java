package com.ironhack.mascotas.controllers;

import com.ironhack.mascotas.dtos.gato.GetGatoDto;
import com.ironhack.mascotas.entities.Gato;
import com.ironhack.mascotas.services.GatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/gatos")
public class GatoController {

    @Autowired
    private GatoService gatoService;

    //Trae todos los gatos
    @GetMapping
    public ResponseEntity<List<GetGatoDto>> listaDeGatos() {
        return new ResponseEntity<>(gatoService.consultarGatos(), HttpStatus.OK);
    }

    //Buscar por ID's
    @GetMapping("/{id}")
    public ResponseEntity<Gato> consultarGato(@PathVariable Long id) {
        Optional<Gato> gatoOptional=gatoService.findById(id);
        if(gatoOptional.isPresent()){
            return new ResponseEntity<>(gatoOptional.get(),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Gato registrarNuevoGato(@RequestBody Gato gatoJSON) {
        return gatoService.saveGato(gatoJSON);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGato(@PathVariable Long id) {
        if (id != null) {
            gatoService.deleteGato(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}

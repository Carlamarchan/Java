package com.ironhack.mascotas.controllers;

import com.ironhack.mascotas.entities.Owner;
import com.ironhack.mascotas.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    //Trae todos los owners
    @GetMapping
    public List<Owner> listaDeOwners() {
        return ownerService.getAll();
    }

    //Buscar por ID's
    @GetMapping("/{id}")
    public Optional<Owner> consultarOwnerByID(@PathVariable Long id) {
        return ownerService.findById(id);
    }

    @PostMapping
    public Owner registrarNuevoOwner(@RequestBody Owner ownerJSON) {
        return ownerService.saveOwner(ownerJSON);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOwner(@PathVariable Long id) {
        if (id != null) {
            ownerService.deleteOwner(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}

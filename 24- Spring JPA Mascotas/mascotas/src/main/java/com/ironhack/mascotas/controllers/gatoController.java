package com.ironhack.mascotas.controllers;

import com.ironhack.mascotas.entities.Gato;
import com.ironhack.mascotas.services.GatoService;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gatos")
public class gatoController {

    @Autowired
    private GatoService gatoService;

    //Trae todos los gatos
    @GetMapping
    public List<Gato> listaDeGatos(){
        return gatoService.consultarGatos();
    }

    //Buscar por ID's
    @GetMapping("/{id}")
    public Optional<Gato> consultarGato(@PathVariable Long id){
        return gatoService.findById(id);
    }

    @PostMapping
    public Gato registrarNuevoGato(@RequestBody Gato gatoJSON){
        return gatoService.saveGato(gatoJSON);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGato(@PathVariable Long id){
        if (id!=null){
            gatoService.deleteGato(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }

    }

}

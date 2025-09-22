package com.ironHack.educacion;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Aquí es donde le decimos las rutas (endpoints) y también el mapping
@RestController
@RequestMapping("/estudiante")
@Tag(name="Estudiantes", description = "Operaciones CRUD para Estudiantes")
public class EstudianteController {
    private  EstudianteRepository estudianteRepository;  //se aconseja final

    public EstudianteController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @GetMapping
    @Operation(summary = "Lista de todos los estudiantes", description = "Devuelve la lista de todos los estudiantes")
    public List<Estudiante> getALl(){
        return estudianteRepository.findAll();
    }

    //Hay que poner entre las llaves o si no es un número
    //Es una ruta variable
    @GetMapping("/{id}")
    @Operation(summary = "Estudiante por ID", description = "Devuelve al estudiante según su número de ID")
    public Estudiante getById(@PathVariable int id){
        return estudianteRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Estudiante no encontrado"));
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo Estudiante", description = "Permite ingresar un nuevo estudiante")
    public void addOrUpdate(@RequestBody Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }

   /* @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        estudianteRepository.deleteById(id);
    }*/
}

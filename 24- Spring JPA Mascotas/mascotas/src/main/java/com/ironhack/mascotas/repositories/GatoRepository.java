package com.ironhack.mascotas.repositories;
import com.ironhack.mascotas.entities.Gato;
import org.springframework.data.jpa.repository.JpaRepository;


//Extender los métodos de JPA repositorio pasándole el objeto y el tipo de la clave primaria (id)
public interface GatoRepository extends JpaRepository<Gato, Long> {

}
